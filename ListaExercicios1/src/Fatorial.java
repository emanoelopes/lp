import java.util.Scanner;


public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner f = new Scanner (System.in);
		System.out.println("Digite um numero:");
		int numero = f.nextInt();
		int temp = 1;
		System.out.print(numero+"!=");
		for (int i=numero; i>1; i--){
		temp = i * temp;
		System.out.print(i+"x");
		}
		System.out.println("1="+temp);
		}

}
