//In this code, you can observe that nonstatic block can call static methods and variable.
class Demo2
{
	String name;
	
	static String collegeName="DYPTC";
	
	//static block
	static{
		System.out.println("Static block");
	}
	
	public static void demoStaticMethod(){
		System.out.println("This is static method");
	}
	
	//non-static block
	{
		//here we try to use static variable and method in non static block
		demoStaticMethod();
		System.out.println("collegeName : "+collegeName);
	}
	
	public void demoNonStaticMethod(){
		System.out.println("This is non-static method");
	}
	
	public static void main(String[] args){
		Demo2 d1 = new Demo2();
	}
}