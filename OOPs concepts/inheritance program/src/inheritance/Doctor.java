package inheritance;

public class Doctor {
	String name;
	int fee;
	String degree;
	int exp;
	String hospital;
	
	public Doctor() {}
	public Doctor(String name, int fee, String degree, int exp, String hospital) {
		this.name=name;
		this.degree= degree;
		this.fee = fee;
		this.exp= exp;
		this.hospital= hospital;
	}
	
	public void displayDoctor() {
		System.out.println("Name : "+name);
		System.out.println("Fees : "+fee);
		System.out.println("Degree : "+degree);
		System.out.println("Experience : "+exp);
		System.out.println("Hospital : "+hospital);
	}
	
}
