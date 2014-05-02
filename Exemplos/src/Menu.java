import java.util.Scanner;


public class Menu {
/*
 * Exibe um menu para o usuário
 */
	public static void main(String[] args){
		int comando = 0;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1 para Twitter");
		System.out.println("Digite 2 para Facebook");
		System.out.println("Digite 3 para Gmail");
		System.out.println("Digite 0 para Sair");
		comando = scanner.nextInt();
		switch(comando){
		case 1:
			System.out.println("bloqueado durante a aula");
			break;
		case 2:
			System.out.println("Aguarde, carregando...");
			break;
		case 3:
			System.out.println("fora do ar!");
			break;
		default:
			if(comando < 0 || comando > 3){
				System.out.println("Comando inválido");
			break;
			}
		}
		}while (comando != 0);
		System.out.println("Até a próxima!");
		
	}
}
