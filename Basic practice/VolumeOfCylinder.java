import java.util.Scanner;

class VolumeOfCylinder
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		//final float pi = 22/7;
		System.out.println("Enter a radius and length of cylinder: ");
		float radius = sc.nextFloat();
		float len = sc.nextFloat();
		//System.out.println("Enter a length of cylinder : ");
		
		
		float area = 3.14f * radius * radius;
		float volume = area * len;
		
		System.out.println("the area is "+area);
		System.out.println("The volume is "+volume);
		
	}
}