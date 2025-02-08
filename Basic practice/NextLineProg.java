import java.util.Scanner;
class NextLineProg
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		
		System.out.println("Enter your address : ");
		sc.nextLine();
		String address = sc.nextLine();
		
		
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("address : "+address);
	}
}