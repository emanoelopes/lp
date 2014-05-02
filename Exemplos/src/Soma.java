import java.util.Scanner;


public class Soma {
/*
 * PROGRAMA QUE CALCULA A SOMA DE DOIS NÚMEROS DIGITADOS.
 *
 */
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double a = scanner.nextDouble();
		System.out.println("Digite o segundo número: ");
		double b = scanner.nextDouble();
		double soma = a + b;
		System.out.println("soma: "+soma);
		
	}
}
