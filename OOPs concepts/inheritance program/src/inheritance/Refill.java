package inheritance;

public class Refill {
	String color;
	double size;
	String type;
	
	public Refill() {
		
	}
	Refill(String color, double size, String type){
		this.color = color;
		this.size=size;
		this.type=type;
		System.out.println("Refill created!");
		System.out.println();
	}
	
	public void displayRefil() {
		System.out.println("_____________refill Attribute________________");
		System.out.println("Color : "+color);
		System.out.println("size : "+size);
		System.out.println("refillType : "+type);
	}
}
