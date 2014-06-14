
//Uma hierarquia de classe simples do livro Java para Iniciantes - Cap 7 Herança

//Uma classe para objetos de duas dimensões.
class TwoDShape {
	private double width;
	private double height;
	
	//Construtor parametrizado
	TwoDShape(double w, double h){
		height = h;
		width = w;
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
	
	//Construtor
	Triangle(String s, double w, double h){
		super(w, h);//Chama o construtor da superclasse.

		style = s;
	}
	
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("Triangle is "+ style);
	}
}


class Shapes4{
	public static void main(String[] args) {
		Triangle t1 = new Triangle("filled", 4.0, 4.0);
		Triangle t2 = new Triangle("oulined", 8.0, 12.0);
		
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