package crud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import crud.entidades.Contato;

public class BancoDAO implements IDAO {

	private Connection conn;

	@Override
	public void salvar(Contato c) {
		try {
			conectar();
			// consultar
			//Statement stm = conn.createStatement();
			String sql = "insert into contatos values(?,?)";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, c.getId());
			stm.setString(2, c.getNome());
			
			int cnt = stm.executeUpdate();
			conn.commit();
			desconectar();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void alterar(Contato c) {
		try {
			conectar();
			// consultar
			//Statement stm = conn.createStatement();
			String sql = "update contatos set nome=? "+
			"where id = ?";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, c.getNome());
			stm.setInt(2, c.getId());
			
			int cnt = stm.executeUpdate();
			conn.commit();
			desconectar();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void excluir(Contato c) {
		try {
			conectar();
			// consultar
			//Statement stm = conn.createStatement();
			String sql = "delete from contatos "+
			"where id = ?";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, c.getId());
			
			int cnt = stm.executeUpdate();
			conn.commit();
			desconectar();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Contato consultarPeloId(Integer id) {
		Contato contato = null;

		try {
			conectar();
			// consultar
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("select * from contatos where id="
					+ id);
			/*
			 * while(rs.next()){
			 * System.out.println("id: "+rs.getInt(1)+" nome: "
			 * +rs.getString(2)); }
			 */
			if (rs.next()) {
				contato = new Contato(rs.getInt(1), rs.getString(2));
			}
			desconectar();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return contato;
	}

	private void conectar() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", // filenames
					"sa", // username
					"");
			conn.setAutoCommit(false);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	private void desconectar() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println("erro ao desconectar " + e.getMessage());
		}
	}

}
