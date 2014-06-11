package crud.dao;

import java.util.ArrayList;

import crud.entidades.Contato;

public class MemoriaDAO implements IDAO{
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    
	@Override
	public void salvar(Contato c) {
		if(consultarPeloId(c.getId())!=null){
			throw new RuntimeException("contato ja existe");
		}
		contatos.add(c);		
	}

	@Override
	public void alterar(Contato c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Contato c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contato consultarPeloId(Integer id) {
		for (Contato contato : contatos) {
			if(contato.getId().equals(id)){
				return contato;
			}
		}
		return null;
	}

}
