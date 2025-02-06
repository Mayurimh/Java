class SmallestNum
{
	public static void main(String [] args ){
		int a =6;
		int b =9;
		int c =7;
		
		int small = (a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("Smallest number : ");
	}
}