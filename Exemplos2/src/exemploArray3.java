
public class exemploArray3 {
/*
 * Exemplo de Array Bidimensional
 * 
 * 
 */
	public static void main(String[] args){
		//criando vetor
		String[][] jogoDaVelha = new String[3][3];
		//inicializa valores
		jogoDaVelha[0][0] = "X";
		jogoDaVelha[0][1] = " ";
		jogoDaVelha[0][2] = "X";
		jogoDaVelha[1][0] = " ";
		jogoDaVelha[1][1] = "X";
		jogoDaVelha[1][2] = "0";
		jogoDaVelha[2][0] = " ";
		jogoDaVelha[2][1] = " ";
		jogoDaVelha[2][2] = "0";
		//Exibe valores
		for (int i = 0; i < jogoDaVelha.length; i++){
			for (int j = 0; j < jogoDaVelha[i].length; j++){
					System.out.print(jogoDaVelha[i][j] 	+ " ");
		}
		//quebra de linha
		System.out.println();
	}
}
}
