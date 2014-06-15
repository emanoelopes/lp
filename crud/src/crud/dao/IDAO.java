package crud.dao;

import crud.entidades.Contato;

public interface IDAO {
	public void salvar(Contato c);
    public void alterar(Contato c);
    public void excluir(Contato c);
    public Contato consultarPeloId(Integer id);    
}
