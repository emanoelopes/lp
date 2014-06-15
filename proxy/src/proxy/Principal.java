package proxy;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Imagem> imagens;

	public static void main(String[] args) {
		imagens = new ArrayList<Imagem>();
		for (int i = 0; i < 20; i++) {
			Imagem img = new ImagemReal("imagem"+i+".jpg");
			imagens.add(img);
		}
		exibirImagens();
	}

	private static void exibirImagens() {
		int opt = 0;
		Scanner s = new Scanner(System.in);
		while(opt >= 0){
			System.out.println("digite o indice: ");
			opt = s.nextInt();
			if (opt>=0){
				Imagem img = imagens.get(opt);
				img.mostrarImagem();
			}
		}
	}
}
