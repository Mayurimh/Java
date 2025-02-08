import java.util.Scanner;
class FactorialOfOddDigit
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum =0;
		while(num>0){
			int rem = num%10;
			if(rem%2 !=0){
				int fact = 1;
				for(int i=1; i<=rem; i++){
					fact *= i;
				}
				sum +=fact;
			}
			num/=10;
		}
		System.out.println("Number is "+dup);
		System.out.println("sum of factorial of odd digit of number = "+sum);
		
	}
}