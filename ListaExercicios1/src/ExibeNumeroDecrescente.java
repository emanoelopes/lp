import java.util.Scanner;


public class ExibeNumeroDecrescente {
/*
 * Exibe a sequencia decrescente de numeros inteiros até zero.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		for(int i = numero; i > 0; i--){
			System.out.print(i+"-");
		}
		System.out.println("0");
	}

}
