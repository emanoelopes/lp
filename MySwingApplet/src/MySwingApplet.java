import javax.swing.*;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
 * Esta HTML pode ser usada para iniciar o applet:
 * 
 * <applet code="MySwingApplet" width=400 height=400></applet>
 */

public class MySwingApplet extends JApplet{
	
	JButton btnSupervisor;
	JButton btnEstagiario;
	
	JLabel jlab;
	
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable() {
				
				@Override
				public void run() {
					makeGUI();//inicializa a GUI
					
				}
			});
		} catch(Exception exc){
			System.out.println("Não foi possível criar por causa do "+exc);
		}
	}
	private void makeGUI(){
		setLayout(new FlowLayout());
		btnEstagiario = new JButton("Estagiário");
		btnSupervisor = new JButton("Supervisor");
		
		btnEstagiario.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Você selecionou a opção estagiário");
			}
		});
		btnSupervisor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jlab.setText("Você selecionou a opção supervisor");
			}
		});
		
		add(btnEstagiario);
		add(btnSupervisor);
		
		jlab = new JLabel("Selecione uma opção");
		add(jlab);
	}
}
