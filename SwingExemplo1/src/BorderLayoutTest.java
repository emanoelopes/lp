import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class BorderLayoutTest extends JFrame{

	public BorderLayoutTest(){
        JButton botao1 = new JButton("Botão 1");  
        JButton botao2 = new JButton("Botão 2");  
        JButton botao3 = new JButton("Botão 3");  
        JButton botao4 = new JButton("Botão 4");  
        JButton botao5 = new JButton("Botão 5");
        
        // Como o padrao de um JFrame é o   
        // BorderLayout, simplesmente adicionamos  
        // os componentes na tela
        
        getContentPane().add(botao1, BorderLayout.NORTH);
        getContentPane().add(botao2, BorderLayout.CENTER);
        getContentPane().add(botao3, BorderLayout.WEST);
        getContentPane().add(botao4, BorderLayout.SOUTH);
        getContentPane().add(botao5, BorderLayout.EAST);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pack();
        setVisible(true);
        
	}
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
