package inheritance;

public class Mobile {
	String brand;
	String name;
	double price;
	String type;
	SimCard s;
	
	public Mobile() {
		System.out.println("______default constructor of mobile __________");
	}
	Mobile(String brand,String name,double price,String type){
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.type=type;
		System.out.println("______parameterized constructor of mobile___________");
	}
	public void insertSim(String serviceProvider, String networkType, String type, long simNo) {
		s = new SimCard(serviceProvider,networkType, type,simNo);
		System.out.println("_________Sim inserted successfully_____________");
	}
	public void displayMobile() {
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
		System.out.println(type);
	}
}
