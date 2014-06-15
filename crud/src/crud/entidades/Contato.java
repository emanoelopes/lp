package crud.entidades;

public class Contato {
     private Integer id;
     private String nome;
     
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
