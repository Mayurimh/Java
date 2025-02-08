import java.util.Scanner;
class SumOfDigits
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 to 1000 : ");
		int num =  sc.nextInt();
		
		int sum = 0;
		int rem;
		
		rem = num%10;
		sum = sum + rem;
		num = num/10;
		
		rem = num % 10;
		sum =sum + rem;
		num = num/10;
		
		rem = num% 10;
		sum = sum+ rem;
		
		System.out.println("sum of all digits : "+ sum);
	}
}