class Bike
{
	// attributes or properties
	//Non-static variable
	
	String brand;
	String model;
	double price;
	double mileage;
	double cc;
	
	//action or behaviour
	//non-static methods
	
	public void displayBike(){
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
		System.out.println("milage : "+mileage);
		System.out.println("cc : "+cc);
	}
}