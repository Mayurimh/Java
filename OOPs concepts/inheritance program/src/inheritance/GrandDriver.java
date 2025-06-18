package inheritance;

public class GrandDriver {
	public static void main(String[] args){
		Son son = new Son();
		son.dispalyfathGrand();
		son.displaySon();
		
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("instanceof operator....");
		
		System.out.println(son instanceof Father);
		System.out.println(son instanceof Son);
		System.out.println(son instanceof GrandFather);
		
		Father f1 = new Father();
		System.out.println(f1 instanceof Father);
		System.out.println(f1 instanceof Son);
	}
}
