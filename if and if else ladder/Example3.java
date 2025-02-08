import java.util.Scanner;
class Example3
{
	public static void main(String [] args){
		Scanner a= new Scanner(System.in);
		System.out.println("Do you have hall ticket (true / false) : ");
		boolean ans = a.nextBoolean();
		
		if(ans == false){
			System.out.println("put hall ticket..");
		}
		System.out.println("attend exam..");
	}
}