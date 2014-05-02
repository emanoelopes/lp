import java.util.Scanner;


public class Soma {
/*
 * Solicita dois valores e exibe a soma.
 * 
 */
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("digite o valor da primeira parcela: ");
		double a = scanner.nextDouble();
		System.out.println("digite o valor da segunda parcela: ");
		double b = scanner.nextDouble();
		double soma = soma(a, b);
		System.out.println("soma "+ soma);
	}
	
	private static double soma(double a, double b){
		double soma = a + b;
		return soma;
	}
}
