import java.util.Scanner;
class EvenOdd
{
	public static void main(String [] args){
		int num = new Scanner(System.in).nextInt();
		
		//with mod
		System.out.println(num%2 == num);

		//without % operator
		System.out.println((num/2)*2 == num);
		System.out.println(num/2 == num/2.0);
	}
}