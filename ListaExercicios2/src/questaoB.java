import java.util.Scanner;


public class questaoB {
/*
 * 
 * Escreva um programa que solicite um total de valores inteiros a serem inseridos, receba os
valores e depois exiba esses valores em ordem inversa à ordem de entrada.
Exemplo:
Digite o total de valores. 4
digite valor 1: 10
digite valor 2: 11
digite valor 3: 15
digite valor 4: 41
Valores:
41
15
11
10
 */
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o total de valores: ");
		int t = scanner.nextInt();
		//criar vetor.
		int[] numeros = new int[t]; 
		//Inicializa valores
		for(int i = 0; i < numeros.length; i++){
			System.out.println("Digite o valor " + (i+1) + " :");
			numeros[i] = scanner.nextInt();
		}
		//exibe valores
		System.out.println();
		System.out.println("Valores:");
		for(int i = numeros.length; i > 0; i-- ){
			System.out.println(numeros[i-1]);
		}
		
	}

}
