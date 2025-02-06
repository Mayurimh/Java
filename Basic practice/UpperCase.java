import java.util.Scanner;
class UpperCase
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		String op = ((ch >='a' && ch <= 'z')||(ch >=65 && ch <= 90))?((ch >='a' && ch <= 'z')? (ch + " is a Lower case Alphabet"):(ch + " is a uppper case Alphabet")):
			((ch>='0' && ch<= '9')?(ch + "is a digit"): (ch + " is a special character"));
		System.out.println(op);
	}
}