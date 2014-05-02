import java.util.*;

/*
 * Criar um programa que divida a sala em equipes, soteando os alunos aleatoriamente.
 * 
 */
public class Aleatorio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Total de alunos: ");
		int t = in.nextInt();
		System.out.println("Quantidade de alunos por equipe: ");
		int ae = in.nextInt();
		int eq = 0;
		if (t % ae != 0){
			eq = Math.round(t/ae)+1;
		} else{
			eq = Math.round(t/ae);
		}
		System.out.println("Quantidade de equipes: "+eq);
		//Preencher o array 'turma' com o total de alunos.
		int[] turma = new int[t];
		for (int i = 0; i < turma.length; i++) {
			turma[i] = i + 1;
		}
		//Preencher um array bidimensional com as equipes e seus integrantes sorteados.
		int[][] equipe = new int[eq][ae];
		for (int i = 0; i < eq ; i++) {
			//sorteia os integrantes da equipe e adiciona no segundo array.
			for (int j = 0; j < ae; j++) {
		
				//cria um índice aleatório para buscar o valor no array(Entre 0 e t-1).
				int aleatorio = (int)(Math.random()*t);//O método random retorna por padrão um valor double.
				
				//Seleciona o valor correspondente e guarda no vetor.
				equipe[i][j] = aleatorio;
				
				//Move o último da turma para a localização sorteada.
				//turma[aleatorio]=turma[t-1];
				t--;
			}
		}
		for (int i = 0; i < equipe.length; i++) {
			System.out.println();
			System.out.println("Equipe"+i+1);
			for(int j = 0; j < equipe[i].length;j++){
				System.out.println(equipe[i][j]);
			}
		}
	}
}