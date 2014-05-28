package crud.dao;

import crud.telas.entidades.Contato;

public interface IDAO {
	public void salvar(Contato c);
	public void alterar(Contato c);
	public void excluir(Contato c);
	public void consultarPeloId(Integer id);
}
