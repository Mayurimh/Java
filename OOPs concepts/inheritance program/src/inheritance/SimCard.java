package inheritance;

public class SimCard {
	String serviceProvider ; 
	String networkType;
	String type;
	long simNo;
	public SimCard() {System.out.println("___________default Simcard constructor_________");}
	SimCard(String serviceProvider, String networkType, String type, long simNo){
		System.out.println("___________paramterised simcard constructor_________");
		this.serviceProvider = serviceProvider;
		this.networkType = networkType;
		this.simNo = simNo;
		this.type = type;
	}
	public void displaySim() {
		System.out.println(serviceProvider);
		System.out.println(networkType);
		System.out.println(simNo);
		System.out.println(type);
	}
	
}
