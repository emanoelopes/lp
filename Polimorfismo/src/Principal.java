
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arquivo a = new Arquivo();
		Internet i = new Internet();
		Internet i2 = new Internet();
		Entrada e = new Entrada();
		e.setId(1);
		e.setId(2);
		leEntrada(a);
	}
	
	public static void leEntrada(Entrada e){
		System.out.println(e.nexLine());
	}
}
