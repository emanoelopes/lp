package template;

public class MeuServlet extends HTTPServlet{

	@Override
	public void doGet(String reqHTTP) {
		System.out.println("gerando html get");
	}

	@Override
	public void doPost(String reqHTTP) {
		System.out.println("gerando html post");
	}

}
