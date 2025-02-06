import java.util.Scanner;
class PrimeWithoutLoop
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int num = sc.nextInt();
		
		System.out.println((num == 2 || num == 3)?("Prime number"):
			((num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0)?(num + "is not prime "):("number is prime")));
	}
}