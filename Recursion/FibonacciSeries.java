import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range : ");
		int range = sc.nextInt();
		fibo(range,0,1);
	}
	public static void fibo(int r, int n1, int n2){
		if(r>0){
			int n3 = n1+n2;
			System.out.print(n1+" ");
			fibo(--r, n2, n3);
		}
	}
}