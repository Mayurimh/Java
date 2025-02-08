import java.util.Scanner;
class Calculator
{
	public static void main(String [] args){
		Scanner ip =new Scanner(System.in);
		System.out.println("   WELCOME TO CALCULATOR ");
		System.out.println();
		System.out.print("Enter the first number : ");
		float num1 = ip.nextFloat();
		
		System.out.print("Enter the second number : ");
		float num2 = ip.nextFloat();
		
		System.out.println();
		
		//options
		System.out.println("1. ADDITION");
		System.out.println("2. SUBTRACTION");
		System.out.println("3. MULTIPLICATION");
		System.out.println("4. DIVISION");
		System.out.println("5. MODULUS");
		for(;;){
			System.out.println();
			System.out.println("Enter your choice : ");
			int opt = ip.nextInt();
			
			switch(opt){
				case 1:{
					float result = num1+num2;
					System.out.print("Addition of "+num1+" & "+num2+ " is "+result);
					break;
				}
				case 2:{
					float result = num1 - num2;
					System.out.print("Substraction of "+num1+" & "+num2+ " is "+result);
					break;
				}
				case 3:{
					float result = num1 * num2;
					System.out.print("Multiplication of "+num1+" & "+num2+ " is "+result);
					break;
				}
				case 4:{
					float result = num1 / num2;
					System.out.print("Division of "+num1+" & "+num2+ " is "+result);
					break;
				}
				case 5:{
					float result = num1 % num2;
					System.out.print("Modulus of "+num1+" & "+num2+ " is "+result);
					break;
				}
				default :
				{
					System.out.println("Invalid option...");
					System.exit(0);
				}
			}
		}
	}
}