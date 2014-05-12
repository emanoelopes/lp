
public class Professor extends Pessoa{
	public Professor(String matricula, String nome) {
		super(matricula, nome);
	}

	private Integer cargaHoraria;

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String exibir(){
		return "Professor - Matrícula: "+getMatricula()+"Nome: "+getNome()+"CH: "+cargaHoraria;
		
	}
	
	
}
