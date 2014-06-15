
//Uma hierarquia de classe simples do livro Java para Iniciantes - Cap 7 Herança

//Uma classe para objetos de duas dimensões.
abstract class TwoDShape {
	private double width;
	private double height;
	private String name;
	
	//Construtor padrão
	TwoDShape(){
		width = height = 0.0;
		name = "none";
	}
	
	//Construtor parametrizado
	TwoDShape(double w, double h, String n){
		height = h;
		width = w;
		name = n;
	}
	
	//Constrói objeto com altura e largura iguais.
	TwoDShape(double x, String n){
		width = height = x;
		name = n;
	}
	
	//Constrói um objeto a partir de outro.
	TwoDShape(TwoDShape ob){
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	//Métodos acessadores para width e height
	double getWidth() {return width;}
	void setWidth(double w) {this.width = w;}
	double getHeight() {return height;}
	void setHeight(double h) {this.height = h;}
	
	String getName(){return name;}
	
	void showDim(){
		System.out.println("Width and hight are " +width + " and " + height);
	}
	
	//Agora area() é abstrato.
	abstract double area();
	
}

//Subclasse de TwoDShape para triângulos.
class Triangle extends TwoDShape{
	private String style;
	
	//Construtor padrão
	Triangle(){
		super();//Chama o construtor padrão da superclasse.
		style = "none";
	}
	
	//Construtor parametrizado.
	Triangle(String s, double w, double h){
		super(w, h, "triangle");//Chama o construtor parametrizado da superclasse.

		style = s;
	}

	//Construtor com um argumento.
	Triangle(double x){
		super(x, "triangle"); //Chama o construtor da superclasse com um argumento.
		
		style = "filled";
	}
	
	//Constrói um objeto a partir de outro.
	Triangle(Triangle ob){
		super(ob);//Passa o objeto para o construtor de TwoDShape
		style = ob.style;
	}
	//Sobrepõe area() para Triangle
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("Triangle is "+ style);
	}
}

//Subclasse de TwoDShape para retângulos
class Rectangle extends TwoDShape{
	//Construtor padrão
	Rectangle() {
		super();
	}
	//Construtor para Rectangle
	Rectangle(double w, double h){
		super(w, h, "rectangle");//chama o construtor da superclasse
	}
	//Constrói um quadrado
	Rectangle(double x){
		super(x, "rectangle");//Chama o construtor da superclasse.
	}
	
	//Constrói um objeto a partir de outro
	Rectangle(Rectangle ob){
		super(ob);//passa o objeto para o construtor de TwoDShape.
	}
	
	boolean isSquare(){
		if(getWidth() == getHeight()) return true;
		return false;
	}
	//Sobrepõe area() para Rectangle.
	double area(){
		return getWidth() * getHeight();
}

class AbsShape{
	public static void main(String args[]) {
		TwoDShape shapes[] = new TwoDShape[4];
		shapes[0] = new Triangle("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Object is "+shapes[i].getName());
			System.out.println("Area is "+shapes[i].area());
			System.out.println();
		}
	}
		
	}
}
