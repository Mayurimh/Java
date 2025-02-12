import java.util.Scanner;
class PrimeFactorial
{
	public static void main(String [] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		
		for(int i =2; i<num; i++){
			if(num % i==0){
				int cnt = 0;
				for(int j=2; j<i; j++){
					if(i % j == 0){
						cnt++;
					}
				}
				if(cnt==0)
					System.out.print(i+" ");
			}
		}
	}
}