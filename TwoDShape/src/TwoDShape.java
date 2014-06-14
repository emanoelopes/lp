
//Uma hierarquia de classe simples do livro Java para Iniciantes - Cap 7 Herança

//Uma classe para objetos de duas dimensões.
class TwoDShape {
	private double width;
	private double height;
	
	//Construtor padrão
	TwoDShape(){
		width = height = 0.0;
	}
	
	//Construtor parametrizado
	TwoDShape(double w, double h){
		height = h;
		width = w;
	}
	
	//Constrói objeto com altura e largura iguais.
	TwoDShape(double x){
		width = height = x;
	}
	
	//Constrói um objeto a partir de outro.
	TwoDShape(TwoDShape ob){
		width = ob.width;
		height = ob.height;
	}
	
	//Métodos acessadores para width e height
	double getWidth() {return width;}
	void setWidth(double w) {this.width = w;}
	double getHeight() {return height;}
	void setHeight(double h) {this.height = h;}
	
	void showDim(){
		System.out.println("Width and hight are " +width + " and " + height);
	}
	
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
		super(w, h);//Chama o construtor parametrizado da superclasse.

		style = s;
	}

	//Construtor com um argumento.
	Triangle(double x){
		super(x); //Chama o construtor da superclasse com um argumento.
		
		style = "filled";
	}
	
	//Constrói um objeto a partir de outro.
	Triangle(Triangle ob){
		super(ob);//Passa o objeto para o construtor de TwoDShape
		style = ob.style;
	}
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("Triangle is "+ style);
	}
}

//Estende Triangle
class ColorTriangle extends Triangle{
	private String color;
	
	ColorTriangle(String c, String s, double w, double h){
		super(s, w, h);
	
		color = c;
	}
	
	String getColor() {return color;}
	
	void showColor() {
		System.out.println("Color is "+color);
	}
}

class Shapes7{
	public static void main(String[] args) {
		Triangle t1 = new Triangle("outlined", 8.0, 12.0);
	
		//faz uma cópia de t1
		Triangle t2 = new Triangle(t1);
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is "+ t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is "+ t2.area());
		
		
		
	}
}