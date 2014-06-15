import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SwingExemplo2 extends JFrame implements ActionListener{

	JButton botao;
	JPanel panel;
	JTextField texto;
	
	public SwingExemplo2(){
		super("GUJ - Java");
	}
	
	public void criaJanela(){
		texto = new JTextField("Digite algo...");
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		
		botao = new JButton("Clique-me");
		botao.addActionListener(this);
		
		panel.add(texto);
		panel.add(botao);
		
		getContentPane().add(panel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		botao.setText(texto.getText());
		
	}
	public static void main(String[] args) {
		SwingExemplo2 ex2 = new SwingExemplo2();
		ex2.criaJanela();
	}
}
