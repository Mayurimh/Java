//you can observer, When you try to use non-static members in static member that thaime you get CTE. i.e.
// non-static method demoNonStatic() cannot be referenced from a static context

class Demo3
{
	static String brand = "nike";
	int size;
	
	static{
		System.out.println("Static block");
	}
	static{
		demoNonStatic();
		System.out.println("size : "+size);
	}
	
	{
		System.out.println("Non-Static block");
	}
	{
		demoStatic();
		System.out.println("brand : "+brand);
	}
	
	public static void demoStatic(){
		System.out.println("demo static method");
	}
	
	public void demoNonStatic(){
		System.out.println("demo non-static method");
	}
	
	public static void main(String [] args){
		Demo3 d1 = new Demo3();
	}
}