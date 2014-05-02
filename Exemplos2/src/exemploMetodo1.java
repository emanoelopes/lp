
public class exemploMetodo1 {
/*
 * Cria array com 3 elementos, atribui e exibe valores 
 * 
 */
	public static void main(String[] args){
		//criando vetor
		int[] numeros = new int[3];
		//inicializa valores
		numeros[0] = 1;
		numeros[1] = 10;
		numeros[2] = 100;
		//exibe valores
		exibeVetor(numeros);
	}
	private static void exibeVetor(int[] vetor){
		for (int i = 0; i < vetor.length; i++){
			System.out.println(vetor[i]);
		}
	}
}
