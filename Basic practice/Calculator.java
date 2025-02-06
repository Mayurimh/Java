import java.util.Scanner;
class Calculator
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		float n1 = sc.nextFloat();
		
		System.out.println("Enter 2nd number : ");
		float n2 = sc.nextFloat();
		
		System.out.println("Enter operator : ");
		char op = sc.next().charAt(0);
		
		float output = (op == '+')? 
			(n1+n2): ((op == '-')?
			(n1-n2):((op == '*')?
			(n1 * n2):((op == '/')?
			(n1/n2):((op == '%')?
			(n1 % n2):(0.000001f)))));
		
		if(!(output == 0.000001f)){
			System.out.println(n1+ " "+op+" "+n2+" = "+output);
		}
	}
}