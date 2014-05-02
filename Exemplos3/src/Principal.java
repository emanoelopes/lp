import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("digite o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.print("digite saldo inicial da conta");
		Double saldoInicial = scanner.nextDouble();

		Conta conta1 = new Conta();
		conta1.setCliente(nome);
		conta1.creditar(saldoInicial);
		exibirConta(conta1);
		conta1.creditar(100.0);
		exibirConta(conta1);
		conta1.debitar(50.0);
		exibirConta(conta1);
		//System.out.println(conta1.getSaldo());
		
	}

	private static void exibirConta(Conta conta1) {
		System.out.println("Cliente: " + conta1.getCliente() + " \nSaldo Inicial: "
				+ conta1.getSaldo());
	}
	
}
