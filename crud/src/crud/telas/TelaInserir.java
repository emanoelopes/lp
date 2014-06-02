package crud.telas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import crud.dao.IDAO;
import crud.entidades.Contato;

public class TelaInserir extends JFrame {
	JTextField txId;
	JTextField txNome;
	JButton bt1;
	IDAO dao;
	
	public TelaInserir(IDAO dao){
		super("Inserir");
		this.dao=dao;
	}

	public void criaJanela() {
		txId = new JTextField(10);
		txNome = new JTextField(50);
		bt1 = new JButton("inserir");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new JLabel("id: "));
		getContentPane().add(txId);
		getContentPane().add(new JLabel("nome: "));
		getContentPane().add(txNome);
		getContentPane().add(bt1);

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ler os valores das caixas de texto
				Integer id = 0;
				try {
					id = Integer.parseInt(txId.getText());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"o id deve ser um numero natural");
					return;
				}
				if (id < 0) {
					JOptionPane.showMessageDialog(null,
							"o id deve ser um numero natural");
					return;
				}
				String nome = txNome.getText();

				if (nome.equals("")) {
					JOptionPane.showMessageDialog(null,
							"digite um nome para o contato");
					return;
				}
				// instanciar o objeto passando os valores
				Contato c = new Contato(id, nome);
				// solicitao ao dao que save o contato
				try {
					dao.salvar(c);
					JOptionPane.showMessageDialog(null,
							"contato inserido com sucesso");
					txId.setText("");
					txNome.setText("");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,
							e2.getMessage());
				}
				
				
			}
		});

		pack();
	}
}
