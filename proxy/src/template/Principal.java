package template;

public class Principal {
	public static void main(String[] args) {
		MeuServlet s = new MeuServlet();
		s.service("requisicao", "GET");
	}
}
