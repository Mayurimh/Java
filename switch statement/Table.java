import java.util.Scanner;
class Table
{
	public static void main(String [] ar){
		Scanner ip = new Scanner(System.in)
		System.out.println("Enter the number : ");
		int num = ip.nextInt();
		
		System.out.println("Enter the range : ");
		int range = ip.nextInt();
		
		
		for(int i =1; i<= range; i++){
			System.out.println(num + " X "+ i+" = "+ (num*i));
		}
	}
}