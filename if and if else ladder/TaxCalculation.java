import java.util.Scanner;
class TaxCalculation
{
	public static void main(String [] args){
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter your Salary : ");
		double salary  = ip.nextDouble();
		
		if(salary > 0){
			if(salary > 0 && salary <400000){
				System.out.println("jile teri zindagi...");
			}
			else if(salary > 400000 && salary <800000){
				System.out.println("your chargable tax is Rs. "+(salary * 0.05));
			}
			else if(salary > 800000 && salary <1200000){
				System.out.println("your chargable tax is Rs. "+(salary * 0.1));
			}
			else if(salary > 1200000 && salary <1600000){
				System.out.println("your chargable tax is Rs. "+(salary * 0.15));
			}
			else if(salary >1600000  && salary <2000000){
				System.out.println("your chargable tax is Rs. "+(salary * 0.2));
			}
			else if(salary > 2000000 && salary <2400000){
				System.out.println("your chargable tax is Rs. "+(salary * 0.25));
			}
			else if(salary > 2400000){
				System.out.println("your chargable tax is Rs. "+(salary * 0.3));
			}
		}
		else{
			System.out.println("Enter valid salary....");
		}
	}
}