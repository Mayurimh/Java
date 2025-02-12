import java.util.Scanner;
class LargestDigit
{
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		
		int max =0;
		for(int i=num; i>0; i/=10){
			int dgt = i % 10;
			if(max <dgt)
				max = dgt;
		}
		System.out.println("Highest digit of number is "+max);
	}
}