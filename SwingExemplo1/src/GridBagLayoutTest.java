import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GridBagLayoutTest extends JFrame{

	public GridBagLayoutTest(){
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		getContentPane().setLayout(layout);
		
		JButton botao1 = new JButton("Botão 1");  
        JButton botao2 = new JButton("Botão 2");  
        JButton botao3 = new JButton("Botão 3");  
        JButton botao4 = new JButton("Botão 4");  
        JButton botao5 = new JButton("Botão 5");
        
     // Configura as proridades de cada botao  
        // Botao 1  
        c.gridy = 0; // primeira linha  
        c.gridx = 0; // primeira coluna  
        layout.setConstraints(botao1, c);  
        getContentPane().add(botao1);  
          
        // Botao 2  
        c.gridy = 0; // primeira linha  
        c.gridx = 1; // segunda coluna  
        layout.setConstraints(botao2, c);  
        getContentPane().add(botao2);  
          
        // Botao 3  
        c.gridy = 0; // primeira linha  
        c.gridx = 2; // terceira coluna  
        layout.setConstraints(botao3, c);  
        getContentPane().add(botao3);  
          
        // Botao 4  
        c.gridy = 1; // segunda linha  
        c.gridx = 0; // primeira coluna  
        c.gridwidth = 3; // Ocupar o espaço de 3 colunas  
        layout.setConstraints(botao4, c);  
        getContentPane().add(botao4);  
          
        // Botao 5  
        c.gridy = 2; // terceira linha  
        c.gridx = 1;   
        c.gridwidth = 2;  
        layout.setConstraints(botao5, c);  
        getContentPane().add(botao5);  
          
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        pack();  
        setVisible(true);  
        
	}
	public static void main(String[] args) {
		new GridBagLayoutTest();
	}
}
