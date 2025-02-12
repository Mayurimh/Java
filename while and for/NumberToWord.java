import java.util.Scanner;
class NumberToWord
{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		String num = sc.next();
		String  str = "";
		for(int i=0; i<num.length(); i++){
			switch(num.charAt(i)){
				case '1':
					str= str+ "One ";
				break;
				case '2':
					str= str+ "Two ";
				break;
				case '3':
					str= str+ "Three ";
				break;
				case '4':
					str= str+ "Four ";
				break;
				case '5':
					str= str+ "Five ";
				break;
				case '6':
					str= str+ "Six ";
				break;
				case '7':
					str= str+ "Seven ";
				break;
				case '8':
					str= str+ "Eight ";
				break;
				case '9':
					str= str+ "Nine ";
				break;
				case '0':
					str= str+ "Zero ";
				break;
			}
		}
		System.out.println(str);
	}
		
}