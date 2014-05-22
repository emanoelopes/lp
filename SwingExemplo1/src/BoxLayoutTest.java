import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Um BoxLayout coloca os componentes em uma única linha ou coluna, 
//permitindo ainda que você especifique o alinhamento deles.
public class BoxLayoutTest extends JFrame {

	public BoxLayoutTest(){
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
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
		new BoxLayoutTest();
	}
}
