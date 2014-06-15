import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlowLayoutTest extends JFrame{
// um FlowLayout é o gerenciador padrão de todo JPanel, 
//caso não seja especificado outro. FlowLayout posiciona os componentes lado-a-lado, 
//e em termos seria a mesma coisa que usar um Boxlayout com a propriedade X_AXIS setada

	public FlowLayoutTest(){
		
		JPanel panel = new JPanel();
		
		JButton botao1 = new JButton("Botão1");
		JButton botao2 = new JButton("Botão2");
		JButton botao3 = new JButton("Botão3");
		JButton botao4 = new JButton("Botão4");
		JButton botao5 = new JButton("Botão5");
		
		//Adicionando os botões ao painel.
		panel.add(botao1);
		panel.add(botao2);
		panel.add(botao3);
		panel.add(botao4);
		panel.add(botao5);
		
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
