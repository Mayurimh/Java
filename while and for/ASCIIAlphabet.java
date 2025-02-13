import java.util.Scanner;
class ASCIIAlphabet
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter alphabets : ");
		String alpha = sc.next().toUpperCase();
		
		int len = alpha.length();
		int char0 =0;
		int result = 0;
		
		
		if(len ==1){
			char0 = (int)alpha.charAt(0);
			result = (char0 -'A')+1;
			}
		else if(len>1){
			char0 = (int)alpha.charAt(0);
			char0 = 26 *((char0 -'A')+1);
			
			int char1 = (int)alpha.charAt(1);
			char1 = (char1 -'A')+1;
			
			result = char0 + char1;
		}
		System.out.println(result);
	}
}