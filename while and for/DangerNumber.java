import java.util.Scanner;
class DangerNumber
{
	public static void main(String [] a){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number : ");
		long num = sc.nextLong();
		int len = 0;
		for(long i = num ; i>0; i/=10){
			len++;
		}
		
		long dup =num;
		int count1=0;
		int count0 =0;
		while(dup > 0){
			
			long rem = dup % 10;
			if(rem == 1){
				count1++;
			}
			else if(count1==7)break;
			else count1=0; 
			dup/=10;
		}
		if(count1==7){
			System.out.print("Danger");
		}
		else{
			System.out.print("not Danger");
		}
	}
}