import java.util.Scanner;
class Example2
{
	public static void main(String [] args){
		Scanner a= new Scanner(System.in);
		System.out.println("Are you book your seat (true / false) : ");
		boolean ans = a.nextBoolean();
		
		if(ans == false){
			System.out.println("reaserve your seat");
		}
		System.out.println("seat on your allowed seat");
	}
}