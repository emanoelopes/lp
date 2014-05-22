import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GridLayoutTest extends JFrame {
	
	public GridLayoutTest(){
		getContentPane().setLayout(new GridLayout(3, 2));
		
		JButton botao1 = new JButton("Botão 1");
		JButton botao2 = new JButton("Botão 2");
		JButton botao3 = new JButton("Botão 3");
		JButton botao4 = new JButton("Botão 4");
		JButton botao5 = new JButton("Botão 5");
		
		getContentPane().add(botao1);
		getContentPane().add(botao2);
		getContentPane().add(botao3);
		getContentPane().add(botao4);
		getContentPane().add(botao5);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
