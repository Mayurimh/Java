package Abstraction;

public class ReactangleImp extends ReactangleProp{
	public double area(double len, double width){
		return len*width;
	}
	public double perimeter(double len, double width){
		return 2*len*width;
	}
	public static void main(String [] args) {
		ReactangleProp r1 = new ReactangleImp();
		System.out.println(r1.perimeter(56,90));
		System.out.println(r1.area(13,20));
		
	}
}