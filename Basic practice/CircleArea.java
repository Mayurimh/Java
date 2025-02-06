import java.util.Scanner;
class CircleArea{
	public static void main(String []arg){
		Scanner sc =new Scanner(System.in);
		final float pi = 22/7;
		System.out.print("Enter radius in cm : ");
		float radius =sc.nextFloat();
		
		float area = pi * radius * radius;
		System.out.println("Area of circle : "+area+"cm2");
	}
}