package inheritance;

public class Cardiologist extends Doctor{
	String spec;
	String organ;
	
	public Cardiologist() {}
	public Cardiologist(String name, int fee, String degree, int exp, 
			String hospital, String spec, String organ) {
//		this.name = name;
//		this.fee = fee;
//		this.degree = degree;
//		this.exp = exp;
//		this.hospital = hospital;
		
		//use super() call statement
		super(name, fee, degree, exp, hospital);
		this.spec = spec;
		this.organ = organ;
	}
	
	public void displayCardio() {
		displayDoctor();
		System.out.println("Specialization : "+spec);
		System.out.println("Organ : "+organ);
	}
}
