class Mango
{
	String type;
	String origin;
	double price;
	
	public Mango printPrice(){
		System.out.println("price: "+price);
		return this;
	}
	public Mango printType(){
		System.out.println("Type: "+type);
		return this;
	}
	public Mango printOrigin(){
		System.out.println("Origin: "+origin);
		return this;
	}
}