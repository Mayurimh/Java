import java.util.Scanner;
class LeftDownTriangle
{
	public static void main(String []a){
		Scanner ip= new Scanner(System.in);
		System.out.print("Enter number of rows:  ");
		int row = ip.nextInt();
		
		for(int i=0; i<row; i++){
			for(int k=0; k<row-1;k++){
				System.out.print("-");
			}
			for(int j=0;j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}