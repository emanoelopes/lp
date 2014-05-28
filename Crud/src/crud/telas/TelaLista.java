package crud.telas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import crud.dao.IDAO;
import crud.entidades.Contato;

public class TelaLista extends JFrame implements ActionListener {

	private JTextArea ta1;
	private IDAO dao;
	private JTextField txt1;
	public TelaLista(IDAO dao){
		super("agenda");
		
		this.dao = dao;
		super("Agenda");
	}
	
	public void criaJanela(){
		
		tx1 = new JTextField(20);
		JButton btPesquisa = new JButton("pesquisar");
		
		//Ligar o bot�o ao evento
		btPesquisa.addActionListener(this);
		
		JButton btInsere = new JButton("inserir");
		
		ta1 = new JTextArea(10,50);
		
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
	
		//adicionando os itens nos panels
		
		p1.add(txt1);
		p1.add(btPesquisa);
		p2.add(ta1);
		p2.add(btInsere);
		
		JLabel lb1 = new JLabel("Texto1");//Aqui s� cria o label.
		JLabel lb2 = new JLabel("Texto2");
		JLabel lb3 = new JLabel("Texto3");
		JLabel lb4 = new JLabel("Texto4");
		JLabel lb5 = new JLabel("Texto5");
		
		getContentPane().add(p1,BorderLayout.NORTH );//Conte�do da janela.
		getContentPane().add(p2,BorderLayout.CENTER);
		getContentPane().add(p3,BorderLayout.SOUTH );
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Encerra o programa ao fechar a janela.
	
		pack(); //Dimensionar os componentes da tela para o tamanho certo a ser exibido.
		setVisible(true);//Ordenar que a janela seja exibida.
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {//esse m�todo � chamado quando clicamos no bot�o.
		//ler o valor do campo tx1
		String texto = tx1.getText();
		//converter para inteiro
		Integer id = Integer.parseInt(texto);
		//pesquisar o contato
		Contato c = dao.consultarPeloId(id);
		//se localizar, exibir dados na ta1
		if(c!=null){
		JOptionPane.showMessageDialog(null, "Clicou!");
		ta1.append("id: "+c.getId()+"\n");
		ta1.append("nome: "+c.getNome());
		
	}else{
		JOptionPane.showMessageDialog(this, "");
	}
}
