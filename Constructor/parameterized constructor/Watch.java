class Watch
{
	String brand="Rolex";
	double price;
	String category;
	String color;

	//non-static block
	{
		System.out.println("non-static block start");
		System.out.println("brand : "+brand);
		if(brand.charAt(0)=='R'){
			price = 10000.0;
		}
		else{
			price = 2000.0;
		}
		System.out.println("Price : "+price);
		System.out.println("non-static block end");
	}
	
	static{
		System.out.println("Environment created successfully");
	}
	
	//constructor
	
	public Watch(){
		System.out.println("No-parameterized constructor..");
	}
	
	
	//parameterized constructor	
	public Watch(String brand, String category, double price, String color){
		System.out.println("parameterised constructor start to work");
		this.brand = brand;
		System.out.println("brand : "+this.brand);
		this.category = category;
		this.price = price;
		this.color = color;
		System.out.println("parameterised constructor end");
	}
	
	//method
	
	public void displayData(){
		System.out.println("enter in method");
		System.out.println("Brand : "+brand);
		System.out.println("category(male/female) : "+category);
		System.out.println("price : "+price);
		System.out.println("color : "+color);
		System.out.println("method ends working");
	}
}