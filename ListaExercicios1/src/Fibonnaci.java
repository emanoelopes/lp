import java.util.Scanner;


public class Fibonnaci {
/*
 * Gera a sequencia de Fibonnaci at� o n�mero desejado.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ant = 0; //Numero anterior.
		int atual = 0; //Numero atual. 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quantidade: ");
		int e = scanner.nextInt();
		if(e < 0 ){
			System.out.println("N�mero inv�lido.");
		} else {
				for (int i = 1; i <= e; i++){
				if (i ==1){
					atual = 1;
					ant = 0;
					System.out.print(atual+ " ");
				} else {
					atual = atual + ant;
					ant = atual - ant;
					System.out.print(atual + " ");
				}
				
			}
			
		}
			
	}
}

