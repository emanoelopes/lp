package crud.telas;

<<<<<<< HEAD
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
=======
import java.sql.SQLException;

import crud.dao.ArquivoSerialDAO;
import crud.dao.BancoDAO;
import crud.dao.IDAO;


public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*Class.forName("org.hsqldb.jdbcDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:hsqldb:hsql://localhost/",    // filenames
                "sa",                     // username
                ""); 
		Statement stm = conn.createStatement();
		stm.executeUpdate("insert into contatos values(4,'CAIO')");
		conn.commit();
		ResultSet rs = stm.executeQuery("select * from contatos");
		while(rs.next()){
			System.out.println("id: "+rs.getInt(1)+" nome: "+rs.getString(2));
		}
		conn.close();
		System.out.println("ok");*/
		
		IDAO dao = new BancoDAO();
		
		
		TelaLista telaLista = new TelaLista(dao);
		telaLista.criaJanela();
		
>>>>>>> refs/heads/iss01

	}

}
