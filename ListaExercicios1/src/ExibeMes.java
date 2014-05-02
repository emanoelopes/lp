import java.util.Scanner;


public class ExibeMes {
	/*
	 * PROGRAMA QUE EXIBE O MÊS DE ACORDO COM A ESCOLHA DO USUÁRIO
	 */
	public static void main(String[] args){
		int op = 0;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um numero de 1 a 12 ou digite 0 para sair.");
			op = scanner.nextInt();
		switch(op){
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			if( op < 0 || op > 12) {
				System.out.println("Opção inválida");
			}
			break;
		}
		} while(op != 0);
		System.out.println("Até breve!");
	}
}
