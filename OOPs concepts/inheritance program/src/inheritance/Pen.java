package inheritance;

public class Pen {
	String brand ;
	double price;
	String pentype;
	Refill refill;
	
	public Pen() {}
	Pen(String brand ,double price,String pentype,String color, double size, String type){
		refill = new Refill(color,size,type);
		this.brand = brand;
		this.price = price;
		this.pentype = pentype;
		
		System.out.append("Pen is created !");
		System.out.println();
	}
	public void displaypen() {
		System.out.println("______________Pen Attribute ____________");
		System.out.println("Brand : "+brand);
		System.out.println("price : "+price);
		System.out.println("pentype : "+pentype);
		System.out.println();
	}
}


