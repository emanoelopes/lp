package crud.entidades;

<<<<<<< HEAD
public class Contato {
     private Integer id;
     private String nome;
=======
import java.io.Serializable;

public class Contato implements Serializable{
	private Integer id;
    private String nome;
>>>>>>> refs/heads/iss01
     
	public Contato(Integer id, String nome) {
		if(id==null){
			throw new RuntimeException("id nulo");
		}
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
     
}
