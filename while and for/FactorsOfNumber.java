import java.util.Scanner;
class FactorsOfNumber
{
	public static void main(String [] args){
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = ip.nextInt();
		int cnt = 0;
		for(int i =1; i<=num; i++){
			if(num % i ==0){
				System.out.print(i+" " );
				cnt++;
			}
		}
		Syste.out.println();
		System.out.println("Count = "+cnt);
	}
}