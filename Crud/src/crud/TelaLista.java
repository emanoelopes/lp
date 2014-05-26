package crud;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaLista extends JFrame implements ActionListener {

	public TelaLista(){
		super("Agenda");
	}
	
	public void criaJanela(){
		
		JTextField txt1 = new JTextField(20);
		JButton btPesquisa = new JButton("pesquisar");
		
		//Ligar o botão ao evento
		btPesquisa.addActionListener(this);
		
		JButton btInsere = new JButton("inserir");
		JTextArea ta1 = new JTextArea(10,50);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
	
		//adicionando os itens nos panels
		
		p1.add(txt1);
		p1.add(btPesquisa);
		p2.add(ta1);
		p2.add(btInsere);
		
		JLabel lb1 = new JLabel("Texto1");//Aqui só cria o label.
		JLabel lb2 = new JLabel("Texto2");
		JLabel lb3 = new JLabel("Texto3");
		JLabel lb4 = new JLabel("Texto4");
		JLabel lb5 = new JLabel("Texto5");
		
		getContentPane().add(p1,BorderLayout.NORTH );//Conteúdo da janela.
		getContentPane().add(p2,BorderLayout.CENTER);
		getContentPane().add(p3,BorderLayout.SOUTH );
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Encerra o programa ao fechar a janela.
	
		pack(); //Dimensionar os componentes da tela para o tamanho certo a ser exibido.
		setVisible(true);//Ordenar que a janela seja exibida.
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {//esse método é chamado quando clicamos no botão.
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Clicou!");
	}
}
