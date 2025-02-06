import java.util.Scanner;
class LargestNum
{
	public static void main(String [] args){
		int a= 3;
		int b=90;
		int c=45;
		
		int lar = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("largets value is : "+lar);
	}
}