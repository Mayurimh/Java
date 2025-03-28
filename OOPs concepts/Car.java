class Car
{
	// This keyword	
	//non-static variable
	String brand;
	String model;
	double price;
	double mileage;
	double cc;
	
	//non-static method
	public void displayDetails(){
		String model="sedans";
		System.out.println("Brand : "+brand);
		System.out.println("model(method) : "+model);
		System.out.println("model(class) : "+this.model);
		System.out.println("price : "+price);
		System.out.println("mileage : "+mileage);
		System.out.println("cc : "+cc);

	}
}