import java.util.Scanner;

public class Conta {
/*
 * Exemplo 1 - Classe Conta
 *
 */
	private String cliente;
	private double saldo = new Double(0.0);
	
	public String getCliente(){
		return cliente;
	}
	
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void creditar(double v){
		if( v != 0 && v > 0){
			saldo = saldo + v;
		} else {
			throw new RuntimeException("v inválido");
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


	