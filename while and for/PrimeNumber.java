import java.util.Scanner;
class PrimeNumber
{
	public static void main(String [] args){
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = ip.nextInt();
		int cnt = 0;
		for(int i =2; i<num; i++){
			if(num % i ==0){
				cnt++;
			}
		}
		System.out.println();
		System.out.println(cnt==0? num+" is prime number..": num+" is not prime number ..");
	}
}