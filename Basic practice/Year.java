import java.util.Scanner;
class Year
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("year : ");
		int y = sc.nextInt();
		int u= y%12;
		float year=(y/12)+(u/10.00f);
		System.out.println(year);
	}	
}
