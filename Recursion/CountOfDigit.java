import java.util.Scanner;
class CountOfDigit
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num= sc.nextInt();
		System.out.println("count:"+countOfDigit(num,0));
	}
	public static int countOfDigit(int num, int cnt){
		return num==0?cnt: countOfDigit(num/10, ++cnt);
	}
}