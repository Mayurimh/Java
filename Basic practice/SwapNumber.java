class SwapNumber
{
	public static void main(String [] agrs){
		int a =10;
		int b =20;
		
		System.out.println("before swapping : ");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("after swapping : ");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}