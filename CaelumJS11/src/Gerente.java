
public class Gerente extends Funcionario{
	int senha;
	int numeroDeFuncionarioGerenciados;
	
	public double getBonificacao(){
		return this.salario * 0.15;
	}
	
public boolean autentica(int senha){
	if(this.senha == senha){
		System.out.println("Acesso permitido");
		return true;
	} else{
		System.out.println("Aceso Negado!");
		return false;
	}
}

public void setNome(String string) {
	// TODO Auto-generated method stub
	
}

public void setSenha(int i) {
	// TODO Auto-generated method stub
	
}
}
