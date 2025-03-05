import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(isArmstrongNum(num,num,0));
	}
	public static boolean isArmstrongNum(int num, int temp, int sum){
		if(temp==0)
			return sum==num;
		else
			return isArmstrongNum(num, temp/10, sum+=power(temp%10,count(num,0)));
	}
	public static int count(int num, int cnt){
		return num ==0?cnt:count(num/10, ++cnt);
	}
	public static int power(int num,int den){
		return den == 0? 1: num * power(num,--den);
	}
}