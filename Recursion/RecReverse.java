import java.util.Scanner;
class RecReverse
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		System.out.println("Reverse  of number : "+reverse(num,0));
	}
	public static int reverse(int num,int rev){
		if(num==0)
			return rev;
		return reverse(num/10, rev=rev*10+num%10);
	}
}