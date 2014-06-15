//Demonstra um botão de ação e trata eventos de ação.

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


class ButtonDemo implements ActionListener{

	JLabel jlab;
	ButtonDemo(){
		//Cria um conteiner JFrame
		JFrame jfrm = new JFrame("Exemplo de botão");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Cria dois botões
		JButton jbtnUp = new JButton("UP");
		JButton jbtnDown = new JButton("Down");
		
		//Adiciona os ouvintes que farão uma ação.
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		
		//Adiciona os botões ao painel
		jfrm.add(jbtnDown);
		jfrm.add(jbtnUp);
		
		jlab = new JLabel("Pressione o botão");
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	//Trata eventos de botão.
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("UP"))
				jlab.setText("Você pressionou UP");
		else
				jlab.setText("Você pressionou DOWN");
	}
	
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new ButtonDemo();	
			}
		});
	}
}
