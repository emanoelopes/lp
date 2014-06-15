
public class Aluno implements Pessoa{
	

	public Aluno(){
		super("12134", "teste2");
		semestre = 1;
	}
	private Integer semestre;


	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public String exibir(){
		return "Aluno - Matrícula: "+getMatricula()+"Nome: "+getNome()+"Semestre: "+semestre;
	}
}
