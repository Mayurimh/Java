class MethodOverloading1
{
	public static void main(String[] args){
		addition(12,67);
		addition(123.87, 788.90);
		addition('a', 'z');
		addition("Mayuri", " Mhavale");
	}
	public static void addition(int a, int b){
		System.out.println("addition of a & b : "+(a+b));
	}
	public static void addition(double a, double b){
		System.out.println("addition of a & b : "+(a+b));
	}
	public static void addition(char a, char b){
		System.out.println("addition of a & b : "+(a+b));
	}
	public static void addition(String a, String b){
		System.out.println("Concatenation of a & b String : "+(a+b));
	}
}