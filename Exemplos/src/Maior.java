import java.util.Scanner;


public class Maior {
/*
 * 
 * PROGRAMA QUE SOLICITA DOIS VALORES E INFORMA O MAIOR
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double a = scanner.nextDouble();
		System.out.println("Digite o segundo número: ");
		double b = scanner.nextDouble();
		if (a > b){
			System.out.println(a + " é maior que " + b);
		} else if (a < b){
			System.out.println(b + " é maior que " +a);
		} else {
			System.out.println(a + " é igual a "+ b);
		}
	}
}
