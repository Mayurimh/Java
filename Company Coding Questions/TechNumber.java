import java.util.Scanner;
class TechNumber
{
	public static void main(String[] a){
		//Scanner sc =  new Scanner(System.in);
		//System.out.println();
		
		int num=2025;
		int len=0;
		int div=1;
		for(int i=num; i>0; i/=10)
			len++;
		
		for(int i=1; i<=len/2;i++){
			div*=10;
		}
		if(len % 2==0){
			int sum = (num/div)+(num%div);
			int sqr =sum * sum;
			if(num == sqr)
				System.out.println(num+" is Tech number");
			else
				System.out.println(num+" is not Tech number");
		}
		else{
			System.out.println("noo");
		}
	}
}