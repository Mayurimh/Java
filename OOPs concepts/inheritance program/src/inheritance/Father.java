package inheritance;

public class Father extends GrandFather{
	String name = "Balaso";
	
	public void displayfather() {
		System.out.println("name : "+name);
	}
	public void dispalyfathGrand() {
		System.out.println("Father name : "+name);
		System.out.println("Grand Father name : "+super.name);
	}
}
