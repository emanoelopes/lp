import java.util.Scanner;


public class ParesImpares {
/*
 * Gera uma sequencia de numeros pares e impares a partir de um n�mero natural informado pelo usu�rio.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Digite um n�mero natural ou zero para terminar o programa:");
			numero = scanner.nextInt();
		if(numero <0){
			System.out.println("N�mero inv�lido.");
		} else if (numero%2 == 0) {
		System.out.print("N�meros pares: ");
		for (int i = numero;i>0;i = i-2){
			System.out.print(i+"-");
		}
		System.out.println("0");
		System.out.print("N�meros �mpares: ");
		for(int j = numero - 1; j > 0 ; j = j - 2){
			System.out.print(j+"-");
		}
		System.out.println("0");
	} else{
		System.out.print("N�meros �mpares: ");
		for (int m = numero ; m > 0 ; m = m - 2){
			System.out.print(m+"-");
		}
		System.out.println("0");
		System.out.print("N�meros pares: ");
		for(int n = numero-1; n > 0; n = n - 2){
			System.out.print(n+"-");
		}
		System.out.println("0");
	}
	} while(numero != 0);
		System.out.println("Programa finalizado!");
	}
}
