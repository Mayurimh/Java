import java.util.Scanner;
class FrequencyOfNum
{
	public static void main(String [] a){
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter a number : ");
		long num = ip.nextLong();
		
		for(int i=0; i<=9; i++){
			int cnt = 0;
			for(long j =num; j>0; j/=10){
				long rem = j % 10;
				if(rem ==i){
					cnt++;
				}
			}
			if(cnt>0){
				System.out.println(i+" : "+cnt);
			}
		}
	}
}