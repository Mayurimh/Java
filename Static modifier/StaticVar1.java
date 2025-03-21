class StaticVar1
{
	static double balance;
	public static void main(String[] args)
	{
		System.out.println("Current balance : "+balance);
		credit(100000);
		debit(1000);
	}
	public static void debit(double amt){
		if(amt >0 && balance - amt > 0){
			balance -= amt;
			System.out.println("Amount debited successfully !");
			System.out.println("Current balance : "+balance);
		}
		else{
			System.out.println("Insufficient balance!");
		}
	}
	public static void credit(double amt){
		if(amt>0){
			balance+=amt;
			System.out.println("Amount credited successfully !");
			System.out.println("Current balance : "+balance);
		}
		else{
			System.out.println("invalid amount!");
		}
	}
}