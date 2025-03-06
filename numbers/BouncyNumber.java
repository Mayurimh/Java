import java.util.Scanner;
class BouncyNumber
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("is a number bouncy : "+bouncyNum(num));
	}
	public static boolean bouncyNum(int num){
		boolean incre = false;
		boolean decre = false;
		int lastDig= num % 10;
		num/=10;
		int secLast = num % 10;
		while(num>0){
			if(lastDig>secLast)
				incre = true;
			else if(lastDig<secLast)
				decre = true;
			lastDig = secLast;
			secLast = num % 10;
			num/=10;
		}
		return incre&&decre;
	}
}