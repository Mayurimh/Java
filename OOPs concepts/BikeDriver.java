class BikeDriver
{
	public static void main(String[] args){
		Bike b1 = new Bike();
		
		b1.displayBike();
		
		System.out.println("__________________________________________");
		
		Bike b2 = new Bike();
		
		b2.brand = "Honda";
		b2.model = "Grom";
		b2.price = 550000.0;
		b2.mileage =  18.65;
		b2.cc= 124.89;
		
		b2.displayBike();
		
	}
}