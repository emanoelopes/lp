import java.util.Scanner;


public class Maior {
/*
 * 
 * PROGRAMA QUE SOLICITA DOIS VALORES E INFORMA O MAIOR
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		double a = scanner.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double b = scanner.nextDouble();
		if (a > b){
			System.out.println(a + " � maior que " + b);
		} else if (a < b){
			System.out.println(b + " � maior que " +a);
		} else {
			System.out.println(a + " � igual a "+ b);
		}
	}
}
