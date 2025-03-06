import java.util.Scanner;
class PascalTriangle
{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to print pascal triangle : ");
		int num = sc.nextInt();
		pascalTriangle(num);
	}
	public static void pascalTriangle(int num){
		for(int i=0; i<num; i++){
			for(int j=0; j<num-i; j++)
				System.out.print(" "+" ");
			for(int k=0; k<=i; k++){
				System.out.print(fact(i)/(fact(k)*fact(i-k))+"   ");
			}
			System.out.println();
		}
	}
	public static int fact(int num){
		int fact =1;
		for(int i=num; i>1; i--)
			fact *=i;
		return fact;
	}
}