import java.util.Scanner;

public class Conta {
/*
 * Exemplo 1 - Classe Conta
 *
 */
	private String cliente;//Para encapsular os atributos, devemos colocar private.
	private double saldo = new Double(0.0);
	
	//Criar um m�todo para poder ler o atributo cliente.
	public String getCliente(){
		return cliente;
	}
	
	//Criar um m�todo para poder alterar o atributo cliente.
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	//Criar o m�todo para permitir a leitura dos atributo saldo.
	public double getSaldo(){
		return saldo;
	}
	
	//Criar o m�todo para alterar dos atributo saldo.
		public Double setSaldo(){
		return saldo;
	}
	
	//Metodo para alterar os atributos.
	public void creditar(double v){
		if( v != 0 && v > 0){
			saldo = saldo + v;
		} else {
			throw new RuntimeException("v inv�lido");
		}
	}
	public void debitar(double v){
		if (v > saldo){
			throw new RuntimeException("Saldo insuficiente");
		} else{
		saldo = saldo - v;
	}
	}
}


	