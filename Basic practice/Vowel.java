import java.util.Scanner;
class Vowel
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
		//String op = (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='u'||ch=='U')?
			//(ch + " is Vowel"):(ch + " is not Vowel");
		String op = ((ch >= 'a' && ch <= 'z' ) || (ch >= 'A' && ch <= 'Z' ) )? 
			((ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='u'||ch=='U')?
			(ch + " is Vowel"):(ch + " is a consonant")): (ch +" is not a Alphabet");
		System.out.println(op);
	} 
}