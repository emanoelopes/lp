package crud.telas;

import crud.dao.IDAO;

public class Principal {
	
	public static void main(String[] args) {
		
		//Padr�o utilizado: inje��o de depend�ncia.
		IDAO dao = new memoriaDAO();
		dao.salvar(new Contato(1, "ANA"));
		dao.salvar(new Contato(2, "EMANOEL"));
		TelaLista telaLista = new TelaLista();
		telaLista.criaJanela();
	}
}
