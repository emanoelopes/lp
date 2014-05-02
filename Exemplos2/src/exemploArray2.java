import java.util.Scanner;


public class exemploArray2 {
/*
 * Cria array com 3 elementos, atribui valores e exibe.
 * 
 */
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int t = scanner.nextInt();
		//criando o vetor
		int[] numeros = new int[t];
		//inicializa valores
		for(int i = 0; i < numeros.length; i++){
			numeros[i] = i;
		}
		//exibe valores
		for (int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i]);
		}
		
	}
}
