import java.util.Scanner;
class UglyNumber
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("is number Ugly or not : "+uglyNumber(num));
	}
	public static boolean uglyNumber(int num){
		while(num!=1){
			if(num % 2==0){
				num/=2;
			}
			else if(num % 3 == 0){
				num/=3;
			}
			else if(num % 5 == 0)
				num/=5;
			else
				return false;
		}
		return true;
	}
}