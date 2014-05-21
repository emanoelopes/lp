
public class Principal {
	public static void main(String[] args) {
		Aluno a = new Aluno();
//		a.setMatricula("2222");
//		a.setNome("Joao");
//		a.setSemestre(5);
		
		System.out.println(a.exibir());
		
		Professor p = new Professor("8923742", "Emanoel");
//		p.setMatricula("1111");
//		p.setNome("Paulo");
//		p.setCargaHoraria(200);
	
		mostra(a);//Mostra o aluno
		mostra(p);//Mostra o professor
}
	public static void mostra(Pessoa pessoa){
		System.out.println(pessoa.exibir());
	}
}
