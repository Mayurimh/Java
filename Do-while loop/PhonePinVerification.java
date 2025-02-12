import java.util.Scanner;
class PhonePinVerification
{
	public static void main(String[] args)throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
	
		int passWord =1890;
		int seconds =5000;
		outerloop:
		for( ; ; ){
			int attempt = 3;
			do{
			System.out.print("Enter a Pin : ");
			int pin = sc.nextInt();
			
			if(pin == passWord){
				System.out.println("PHONE UNLOCKED... :)");
				break outerloop;
			}
			else{
				System.out.println("WRONG PASSWORD.. :(");
				System.out.println("Your have "+(attempt-1)+" attempt left..");
				attempt --;
			}
		}
			while(attempt >=1);
			System.out.println("PHONE IS DISABLED FOR "+(seconds/1000)+" sec..");
			Thread.sleep(seconds);
			System.out.println();
			seconds *=2;
		}
	}
}