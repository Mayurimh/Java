class CarDriver
{
	public static void main(String[] args){
		Car c1 = new Car();
		c1.brand = "Mercedes-Benz";
		c1.model = "coupes";
		c1.price = 7500000;
		c1.mileage = 14.49 ;
		c1.cc = 3982;
		
		c1.displayDetails();
		System.out.println("_______________________________");
		
		Car c2 = new Car();
		c2.brand = "BMW";
		c2.model = "THE NEW BMW Z4 M40i";
		c2.price =  9290000;
		c2.mileage = 12.09;
		c2.cc = 2998;
		
		c2.displayDetails();
	}
}