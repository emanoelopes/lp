package crud.telas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import crud.dao.IDAO;
import crud.entidades.Contato;

public class TelaLista extends JFrame implements ActionListener{
	private IDAO dao;
	private JTextField tx1;
	private JTextArea ta1;
	public TelaLista(IDAO dao) {
		super("agenda");
		this.dao = dao;
	}
	public void criaJanela(){
		tx1 = new JTextField(20);
		JButton btPesquisa = new JButton("pesquisar");
		btPesquisa.addActionListener(this);
		JButton btInsere = new JButton("inserir");
		
		ta1 = new JTextArea(10,50);

		JPanel p1 = new JPanel();
		
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p1.add(tx1);
		p1.add(btPesquisa);
		p2.add(ta1);
		p3.add(btInsere);
		getContentPane().add(p1,BorderLayout.NORTH);
		getContentPane().add(p2,BorderLayout.CENTER);
		getContentPane().add(p3,BorderLayout.SOUTH);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);  
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//ler o valor do campo tx1
		String texto = tx1.getText();
		//converter para inteiro
		Integer id = Integer.parseInt(texto);
		//pesquisar o contato usando o dao
		Contato c = dao.consultarPeloId(id);
		//se localizar exibir dados na ta1
		if(c!=null){
			ta1.append("id: "+c.getId()+"\n");
			ta1.append("nome: "+c.getNome()+"\n");
		}else{
			JOptionPane.showMessageDialog(this, "contato nao localizado");
		}
		
	}
}

