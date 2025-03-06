import java.util.Scanner;
class IncreasingNumber
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("is thsi number is increasing number : "+increasingNum(num));
	}
	public static boolean increasingNum(int num){
		boolean incre = false;
		int lastdig= num %10;
		num /=10;
		if(lastdig>num%10){
			while(num>0){
				int rem = num % 10;
				if(lastdig>rem)
					incre = true;
				else
					incre =false;
				lastdig =rem;
				num/=10;
			}
			return incre;
		}
		return false;
	}
}