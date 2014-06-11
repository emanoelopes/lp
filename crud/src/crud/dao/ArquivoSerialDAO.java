package crud.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import crud.entidades.Contato;

public class ArquivoSerialDAO implements IDAO {

	private void gravarContatos(ArrayList<Contato> contatos) {
		try {
			FileOutputStream arquivoGrav = new FileOutputStream("saida.dat");
			ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
			objGravar.writeObject(contatos);
			objGravar.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private ArrayList<Contato> carregarContatos() {
		try {
			FileInputStream fis = new FileInputStream("saida.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Contato> contatos = (ArrayList<Contato>) ois.readObject();
			ois.close();
			return contatos;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<Contato>();
	}

	@Override
	public void salvar(Contato c) {
		ArrayList<Contato> contatos = carregarContatos();
		if(consultarPeloId(c.getId(),contatos)!=null){
			throw new RuntimeException("contato ja existe");
		}
		contatos.add(c);
		gravarContatos(contatos);
	}

	@Override
	public void alterar(Contato c) {
		ArrayList<Contato> contatos = carregarContatos();
		Contato contato = consultarPeloId(c.getId(),contatos);
		if(contato==null){
			throw new RuntimeException("contato nao existe");
		}
		contatos.remove(contato);
		contatos.add(c);
		gravarContatos(contatos);
	}

	@Override
	public void excluir(Contato c) {
		// TODO Auto-generated method stub

	}
	private Contato consultarPeloId(Integer id, ArrayList<Contato> contatos) {
		for (Contato contato : contatos) {
			if(contato.getId().equals(id)){
				return contato;
			}
		}
		return null;
	}
	@Override
	public Contato consultarPeloId(Integer id) {
		ArrayList<Contato> contatos = carregarContatos();
		for (Contato contato : contatos) {
			if(contato.getId().equals(id)){
				return contato;
			}
		}
		return null;
	}

}
