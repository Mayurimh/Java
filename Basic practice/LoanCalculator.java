import java.util.Scanner;
class LoanCalculator
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("	LOAN CALCULATOR");
		System.out.println();
		System.out.println("Enter the amount : ");
		float amount = sc.nextFloat();
		
		System.out.println("Enter the Rate of interest : ");
		float roi = sc.nextFloat();
		
		System.out.println("Enter the tenure (months) : ");
		int months =  sc.nextInt();
		
		String str = (months/12)+"."+(months%12);
		float con = Float.parseFloat(str);
		
		System.out.println();
		System.out.println("	LOAN CALCULATION");
		System.out.println("principal Amount : "+amount);
		
		System.out.println("Rate of interest : "+roi);
		
		System.out.println("Tenure : "+months+" months");
		
		float intYear = amount*roi /100;
		float totalInter = intYear * con;
		System.out.println("Interest : "+totalInter);
		float outstanding = amount + totalInter;;;;
		System.out.println("Total OutStanding Amount : "+outstanding);
		System.out.println("EMI : "+(outstanding/months)+ " rs");

	}
}