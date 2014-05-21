
public class Pessoa {

		private String matricula;
		private String nome;
		
		//construtor
		public Pessoa(String matricula, String nome){
			matricula = "9999";
			nome = "Emanoel";
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String exibir(){
			return ""; 
		}
}
