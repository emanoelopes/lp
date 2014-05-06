import java.util.Scanner;


public class Questao02 {

	private static Scanner s;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Olá Dayana, digite um Número: ");
		Integer numero = s.nextInt();
		System.out.println("Você digitou: "+numero);
		
		for (int i = numero; i > 0; i=i-2) {
				System.out.print(i+"-");
			} 

}
}
