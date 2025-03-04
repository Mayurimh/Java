import java.util.Scanner;
class SumOfMultipleTable
{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Sum of table of number is "+sumOfTable(num));
	}
	public static int sumOfTable(int num){
		int sum =0;
		
		for(int i=1; i<=10; i++){
			int mul = num * i;
			//System.out.println(mul);
			sum += mul;
		}
		return sum;
	}
}