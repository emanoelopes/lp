import java.util.Scanner;


public class BomDia {
/*
 * PROGRAMA QUE EXIBE UMA MENSAGEM DE ACORDO COM O CÓDIGO DIGITADO
 * 
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1 para Bom Dia");
		System.out.println("Digite 2 para Boa Tarde");
		System.out.println("Digite 3 para Boa Noite");
		int comando = scanner.nextInt();
		switch(comando){
		case 1:
			System.out.println("Bom dia");
			break;
		case 2:
			System.out.println("Boa tarde");
			break;
		case 3:
			System.out.println("Boa noite");
			break;
		}
	}
}
