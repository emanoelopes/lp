package crud.telas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import crud.dao.IDAO;
import crud.entidades.Contato;

public class TelaLista extends JFrame implements ActionListener {
	private Contato ultimoContatoPesquisado;
	private IDAO dao;
	private JTextField tx1;
	private JTextArea ta1;
	private TelaInserir telaInserir;
	private TelaAlterar telaAlterar;
	private JButton btPesquisa;

	public TelaLista(IDAO dao) {
		super("agenda");
		this.dao = dao;
	}

	public void criaJanela() {
		telaInserir = new TelaInserir(dao);
		telaInserir.criaJanela();
		telaAlterar = new TelaAlterar(dao);
		telaAlterar.criaJanela();

		tx1 = new JTextField(20);
		btPesquisa = new JButton("pesquisar");
		btPesquisa.addActionListener(this);
		JButton btInsere = new JButton("inserir");
		JButton btAltera = new JButton("alterar");
		JButton btExclui = new JButton("excluir");

		btExclui.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (ultimoContatoPesquisado != null) {
						int ok = JOptionPane
								.showConfirmDialog(null, "excluir contato "
										+ ultimoContatoPesquisado.getId() + "?");
						if (ok == JOptionPane.OK_OPTION) {
							dao.excluir(ultimoContatoPesquisado);
						}
					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

		btAltera.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (ultimoContatoPesquisado != null) {
					telaAlterar.setContato(ultimoContatoPesquisado);
					telaAlterar.setVisible(true);
				}
			}
		});
		btInsere.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				telaInserir.setVisible(true);
			}
		});

		ta1 = new JTextArea(10, 50);

		JPanel p1 = new JPanel();

		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p1.add(tx1);
		p1.add(btPesquisa);
		p2.add(ta1);
		p3.add(btInsere);
		p3.add(btAltera);
		p3.add(btExclui);
		
		getContentPane().add(p1, BorderLayout.NORTH);
		getContentPane().add(p2, BorderLayout.CENTER);
		getContentPane().add(p3, BorderLayout.SOUTH);

		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// ler o valor do campo tx1
		String texto = tx1.getText();
		// converter para inteiro
		Integer id = 0;
		try {
			id = Integer.parseInt(texto);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this,
					"digite um numero natural valido");
			return;
		}
		// pesquisar o contato usando o dao
		Contato c = dao.consultarPeloId(id);
		ultimoContatoPesquisado = c;
		// se localizar exibir dados na ta1
		if (c != null) {
			ta1.append("id: " + c.getId() + "\n");
			ta1.append("nome: " + c.getNome() + "\n");
		} else {
			JOptionPane.showMessageDialog(this, "contato nao localizado");
		}

	}
}
