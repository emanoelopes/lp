import java.util.Scanner;


public class ExibeNumeros {
/*
 * PROGRAMA QUE RECEBE UM NUMERO E EXIBE A SEQUENCIA DE ZERO AT� O N�MERO DIGITADO.
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = scanner.nextInt();
		//Gerando a sequencia com o comando for.
		for (int i = 0;i<numero; i++){
			System.out.print(i+"-");
		}
		System.out.println(numero);
		//Gerando sequencia com o comando while
		int i = 0;
		while(i < numero){
			System.out.print(i+"-");
			i++;
		}
		System.out.println(numero);
	}
}
