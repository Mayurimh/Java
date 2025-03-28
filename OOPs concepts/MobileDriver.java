class MobileDriver
{
	public static void main(String[] args){
		Mobile m1 = new Mobile();
		m1.brand = "Apple";
		m1.model = "16 Pro Max";
		m1.price = 150000.0;
		m1.ram = 8;
		m1.rom = 256;
		m1.camera= 3;
		
		m1.displayDetails();
		System.out.println("_______________________________");
		
		Mobile m2 = new Mobile();
		
		m2.brand = "Redmi";
		m2.model = "Redmi Note 14 5G";
		m2.price = 17999;
		m2.ram = 6;
		m2.rom = 166;
		m2.camera= 3;
		
		m2.displayDetails();
		System.out.println("_______________________________");
	}
}