import java.util.Scanner;
class ExOf_IfElse
{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your percentage : ");
		float percent = s.nextFloat();
		
		if(percent > 0 && percent <= 100){
			if(percent < 35){
				System.out.println("Your are Fail..best of luck for next attempt");
			}
			else if(percent >=35 && percent <45 ){
				System.out.println("Your are pass");
			}
			else if(percent >=45 && percent <60){
				System.out.println("Your grade is Second class");
			}
			else if(percent >= 60 && percent <75){
				System.out.println("Your grade is First class :)");
			}
			else if(percent >= 75){
				System.out.println("Your grade is distinction :)");
			}
		}
		else{
			System.out.println("Invalid Percentage...");
		}
	}
}