import java.util.Scanner;
class HigestRepeatedDigit
{
	public static void main(String [] a){
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a number : ");
		long num = ip.nextLong();
		
		int max = 0;
		int ans = 0;
		for(int i=0; i<=9; i++){
			int cnt = 0;
			for(long j=num; j>0; j/=10){
				long rem = j % 10;
				if(rem == i){
					cnt++;
				}
			}
			if(cnt>max){
				max = cnt;
				ans = i;
			}
		}
		System.out.println("Highest reapeated digit is "+ans+" with "+max+" count");
	}
}