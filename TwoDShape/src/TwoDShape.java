
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
	
	//Construtor
	Triangle(String s, double w, double h){
		super(w, h);//Chama o construtor parametrizado da superclasse.

		style = s;
	}

	//Construtor com um argumento.
	Triangle(double x){
		super(x); //Chama o construtor da superclasse com um argumento.
		
		style = "filled";
	}
	
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("Triangle is "+ style);
	}
}


class Shapes5{
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("oulined", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		
		t1 = t2;
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is "+ t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is "+ t2.area());
		
		System.out.println();
		
		System.out.println("Info for t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area is "+t3.area());
		
		System.out.println();
	
		
	}
}