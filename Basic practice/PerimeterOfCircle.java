class PerimeterOfCircle
{
	public static void main(String [] args){
		final float pi= 3.14f;
		float radius = 5.5f;
		
		float area = pi* radius * radius;
		float perimeter = 2 * pi * radius;
		System.out.println("perimeter : "+perimeter);
		System.out.println("area : "+area);
		
	}
}