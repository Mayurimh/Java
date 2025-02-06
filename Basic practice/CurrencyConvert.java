import java.util.Scanner;
class CurrencyConvert
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("   Currency Converter ");
		System.out.println();
		System.out.println("Enter amount(INR): ");
		float inr = sc.nextFloat();
		
		System.out.println();
		System.out.println("LIST OF CURENCIES");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. PKR");
		System.out.println("4. CAD");
		System.out.println("5. JPY");

		System.out.println();
		System.out.println("enter currency : ");
		String curr = sc.next().toUpperCase();
		
		float conCurr = 0;
		
		if(curr.equals("USD")){
			conCurr = inr / 86.56f;
			System.out.println(inr+ " INR = "+conCurr+ " USD");
		}else if(curr.equals("EUR")){
			conCurr = inr / 1.11f;
			System.out.println(inr+ " INR = "+conCurr+ " EUR");
		}else if(curr.equals("PKR")){
			conCurr = inr / 322.82f;
			System.out.println(inr+ " INR = "+conCurr+ " PKR");
		}else if(curr.equals("CAD")){
			conCurr = inr / 1.66f;
			System.out.println(inr+ " INR = "+conCurr+ " CAD");
		}else if(curr.equals("JPY")){
			conCurr = inr / 179.51f;
			System.out.println(inr+ " INR = "+conCurr+ " JPY");
		}else{
			System.out.println("INVALID CURRENCY");
		}
		
		

	}
}