import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SwingExemplo1 extends JFrame{

	JPanel panel;
	JLabel msg;
	
	public SwingExemplo1(){
		super("Java!");
	}
	
	public void criaJanela(){
		panel = new JPanel();
		msg = new JLabel("GUJ.com.br");
		
		panel.add(msg);
		
		getContentPane().add(panel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingExemplo1 s = new SwingExemplo1();
		s.criaJanela();
		
	}
}
