import java.lang.Thread;
import java.util.Scanner;
class VowelCount
{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String un = sc.nextLine();
		
		int len= un.length();
		
		for(int i =0 ; i<len ; i++){
			if(un.charAt(i) =='a'||un.charAt(i) =='A'||un.charAt(i) =='E'||un.charAt(i) =='e'||
				un.charAt(i) =='i'||un.charAt(i) =='I'||un.charAt(i) =='O'||un.charAt(i) =='o'||un.charAt(i) =='u'||
				un.charAt(i) =='U'){
			System.out.print(un.charAt(i)+" ");}
		}
	}
}