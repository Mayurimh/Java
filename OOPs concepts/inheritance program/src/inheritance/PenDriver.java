package inheritance;

public class PenDriver{
	public static void main(String[] args) {
		Pen p1 = new Pen("Reynolds",10,"Ball pen","blue",0.7,"ball point");
		p1.displaypen();
		p1.refill.displayRefil();
		System.out.println("_________________________________");
		
		Pen p2 = new Pen("montax",15,"gellpen","black",0.5,"gell point");
		p2.displaypen();
		p2.refill.displayRefil();
		
	}
}