import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(isAutomorphicNumber(num));		
	}
	public static boolean isAutomorphicNumber(int num){
		int cnt=0;
		for(int i=num; i>0; i/=10)
			cnt++;
		int pow = 1;
		while(cnt>0){
			pow *=10;
			cnt--;
		}
		int autonum = (num * num) % pow;
		if(autonum == num)
			return true;
		return false;
	}
}