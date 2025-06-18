package inheritance;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung","S21",35000.0,"5G");
		m1.displayMobile();
		m1.insertSim("Vivo", "5G", "Prepaid", 9881212381l);
			
	}
}
