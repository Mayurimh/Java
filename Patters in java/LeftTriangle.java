import java.util.Scanner;
class LeftTriangle
{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++){
			for(int j=row-1; j>=i; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print(k);
			}
			System.out.println();
		}
	}
}