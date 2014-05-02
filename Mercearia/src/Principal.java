import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	private static Scanner s;

	public static void main(String[] args) {
		ArrayList<ItemDeCompra> itens = new ArrayList<ItemDeCompra>();
		s = new Scanner(System.in);
		int op = -1;
		while(op != 0){
			System.out.println("1 -> Listar");
			System.out.println("2 -> Listar");
			System.out.println("3 -> Cadastrar");
			System.out.println("4 -> Excluir");
			System.out.println("0 -> Selecionar");
			op = s.nextInt();
		}
		
		
	private static void listarItens(ArrayList<ItemDeCompra> itens){
		int i = 0;
			
		for (ItemDeCompra item : itens) {
			System.out.println(i+": "+item );
			i++;
			}
		}
		
		private static ItemDeCompra criarItem(){
			System.out.println("Descricao:");
			Integer codigo = s.nextInt();
			System.out.println("Preco:");
			Float preco = s.nextFloat();
			s.nextLine();
			System.out.println("Quantidade:");
			int quantidade = s.nextInt();
			s.nextLine();
			ItemDeCompra i = new ItemDeCompra(descricao, preco, quantidade);
			return i;
			
		}
	}

}

