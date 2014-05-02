import java.util.Scanner;


public class Eco {
/*
 * PROGRAMA QUE EXIBE O VALOR DIGITADO
 */
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite um texto: ");
	String texto = scanner.nextLine();
	System.out.println("ECO : "+texto);
}
}
