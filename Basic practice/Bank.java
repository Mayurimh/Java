import java.util.Scanner;
class Bank
{
	public static void main(String [] args){
		Scanner ip =new Scanner(System.in);
		//declare variable locally
		String name1 = null;
		double balance = 0.0;
		long Mobile = 0;
		String password1 = null;
		
		
		for( ; ; ){
			System.out.println();
			System.out.println("*************  WELCOME  ***********");
			System.out.println("            MHAVALE BANK");
			System.out.println();
			System.out.println("1.EXISTNING ACCOUNT");
			System.out.println("2.CREATE NEW ACCOUNT");
			System.out.println();
			System.out.println("Enter you choice : ");
			int opt = ip.nextInt();
			System.out.println();
			
			//create new account
			if(opt == 2){
				System.out.println("      CREATE NEW ACCOUNT ");
				System.out.println();
				System.out.print("Enter Username : ");
				name1 = ip.next();	
				System.out.print("Enter Password : ");
				password1 = ip.next();
				
				ip.nextLine();
				System.out.print("Enter Address : ");
				String address = ip.nextLine();
			
				System.out.print("Enter mobile number : ");
				Mobile = ip.nextLong();
				
				System.out.println("Enter amount of deposit : ");
				balance = ip.nextFloat(); 
				
				System.out.println();
				System.out.println("ACCOUNT CREATED SUCCESSFULLY .. :)");
				continue;
			}
			//login account
			else if(opt == 1){
				if(name1== null){
					System.out.println("   GO AND CREATE YOUR ACCOUNT .. :(");
					System.out.println();
					continue;
				}
				//login user
				System.out.println("       LOGIN");
				System.out.println();
				for(int i =3; i>=1; i--){
					System.out.println("Enter Username : ");
					String usname = ip.next();
					System.out.print("Enter Password : ");
					String passw = ip.next();
					
					if(usname.equals(name1) && passw.equals(password1)){
						//home page
						System.out.println();
						System.out.println("    WELCOME TO HOME PAGE :)");
						System.out.println();
						home:
						for( ; ;){
							System.out.println();
							System.out.println("1.DEPOSIT");
							System.out.println("2.WITHDRAW");
							System.out.println("3.CHECK BALANCE");
							System.out.println("4.MINI STATEMENT");
							System.out.println("5.LOGOUT");
							System.out.println();
							System.out.println();
							System.out.print("Enter your choice : ");
							int opt1 = ip.nextInt();
							System.out.println();
							switch(opt1){
								//DEPOSIT MONEY
								case 1:{
									System.out.println(".... DEPOSIT MONEY ....");
									System.out.println("Enter amount to deposit : ");
									double amt = ip.nextInt();
									
									balance += amt;
									System.out.println("Total balance is Rs. "+balance);
									System.out.println();
									break;
									
								}
								
								//WITHDRAW MONEY
								case 2: {
									System.out.println();
									System.out.println(".... WITHDRAW MONEY ....");
				
										System.out.println("Enter amount to Withdraw : ");
										double amt = ip.nextDouble();
									
										System.out.println("Enter your Pin : ");
										String pin = ip.next();
										if(pin.equals(password1)){
											if(amt <= balance){
												balance -= amt;
												System.out.println("AMOUNT DEBITED SUCCESSFULLY .. :)");
												System.out.println();
											}
											else{
												System.out.println("  INSUFFICIENT BALANCE :(");
											}
										}
										else{
											System.out.println("Invalid Pin");
										}
										break;
								}
								
								//CHECK BALANCE
								case 3:{
									System.out.println(".... CHECK BALANCE ....");
									for(int n =3; n>=1; n-- ){
										System.out.println("Enter your pin : ");
										String pin2 = ip.next();
									
										if(pin2.equals(password1)){
										System.out.print("Your Balance is "+balance);
										continue home;
										}
										else{
											System.out.println("WRONG PIN  :(");
											System.out.println("Attempt left "+(n-1));
										}
										
									}
									System.out.println("YOUR ACCOUNT IS BLOCKED FOR 24 HOURS...");
									System.out.println();
									System.exit(0);
								}
								
								//MINI STATEMENT
								case 4:{
									System.out.println("This is mini statement...");
									break;
								}
								
								//LOGOUT
								case 5:{
									System.out.println("Thank you for using application..");
									System.out.println("Visit Again....");
									System.exit(0);
								}
								//DEFAULT CASE
								default : {
									System.out.println("Invalid option");
									break;
								}
							}
						}
						
					}
					else{
						System.out.println("You have  "+(i-1)+" chances left..");
						System.out.println();
					}
				}
				System.out.println("         INCORRECT CREADENTIAL :(");
				System.exit(0);
			}
			else{
				System.out.println("INVALID OPTION");
			}
		}
	}
}