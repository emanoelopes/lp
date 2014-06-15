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

public class TelaAlterar extends JFrame {
	JTextField txId;
	JTextField txNome;
	JButton bt1;
	IDAO dao;

	public TelaAlterar(IDAO dao) {
		super("Alterar");
		this.dao = dao;
	}

	public void criaJanela() {
		txId = new JTextField(10);
		txId.setEditable(false);
		txNome = new JTextField(50);
		bt1 = new JButton("alterar");
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
				String nome = txNome.getText();

				Contato c = dao.consultarPeloId(id);
				c.setNome(nome);
				// solicitao ao dao que save o contato
				try {
					dao.alterar(c);
					JOptionPane.showMessageDialog(null,
							"contato alteraro com sucesso");
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage());
				}

			}
		});

		pack();
	}

	public void setContato(Contato c) {
		txId.setText(c.getId() + "");
		txNome.setText(c.getNome());
	}
}
