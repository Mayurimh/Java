import java.util.Scanner;
class PalindromeString
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		String oneStr ="";
		
		//palindrome 
		for(int i=0; i<str.length(); i++){
			oneStr = str.charAt(i) + oneStr;
		}
		if(oneStr.equals(str))
			System.out.println(str+" is palindrome string.");
		else
			System.out.println(str+" is not palindrome string.");
	}
}