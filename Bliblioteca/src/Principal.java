import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

   private static Scanner s;
	
	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<Livro>();
		s = new Scanner(System.in);
		int op = -1;
		while(op!=0){
			System.out.println("0 - sair");
			System.out.println("1 - listar");
			System.out.println("2 - cadastrar");
			System.out.println("3 - excluir");
			System.out.println("4 - selecionar");
			op = s.nextInt();
			if(op == 1){
				listarLivros(livros);
			}
			if(op == 2){
				Livro l = criarLivro();
				livros.add(l);
			}
			if(op == 3){
				System.out.println("digite o codigo:");
				int codigo = s.nextInt();
				Livro l = selecionarLivroCod(livros, codigo);
				if(l==null){
					System.out.println("livro nao localizado");
				}else{
					livros.remove(l);
				}
			}
			if(op == 4){
				System.out.println("digite o codigo:");
				int codigo = s.nextInt();
				Livro l = selecionarLivroCod(livros, codigo);
				if(l==null){
					System.out.println("livro nao localizado");
				}else{
					System.out.println("livro localizado: "+l);
				}
			}
			
		}
	}

	private static void listarLivros(ArrayList<Livro> livros) {
		int i = 0;
		
		for (Livro livro : livros) {
			System.out.println(i+": "+livro);
			i++;
		}		
	}

	private static Livro selecionarLivroCod(ArrayList<Livro> livros, Integer cod) {
		for (Livro livro : livros) {
			if (livro.getCodigo()==cod){
				return livro;				
			}
		}		
		return null;
	}
	private static Livro criarLivro() {
		System.out.print("codigo: ");
		Integer codigo = s.nextInt();
		s.nextLine();
		System.out.print("titulo: ");
		String titulo = s.nextLine();
		System.out.print("autor: ");
		String autor = s.nextLine();
		Livro l = new Livro(codigo, titulo, autor);
		return l;
	}
}