package crud.telas;

import crud.dao.IDAO;
import crud.dao.MemoriaDAO;
import crud.entidades.Contato;

public class Principal {

	public static void main(String[] args) {
		IDAO dao = new MemoriaDAO();
		dao.salvar(new Contato(1, "TERESA"));
		dao.salvar(new Contato(2, "LOUISE"));
		TelaLista telaLista = new TelaLista(dao);
		telaLista.criaJanela();

	}

}
