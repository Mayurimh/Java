package inheritance;

public class Son extends Father {
	String name = "Chetan";
	public void displaySon() {
		System.out.println("son name : "+name);
		System.out.println("Fathre name : "+super.name);
	}
}
