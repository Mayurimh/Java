import java.util.Scanner;
class PalindromNum
{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		int dup = num;
		int rev =0;
		while(num>0){
			int rem = num % 10;
			rev = rev*10 + rem;
			num /= 10;
		}
		if(rev == dup)
			System.out.println(dup+ " is Palindrome number.");
		else
			System.out.println(dup+ " is not Palindrome number.");
	}
}