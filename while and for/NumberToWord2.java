import java.util.Scanner;
class NumberToWord2
{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		String  str = "";
		for(int i =num; i>0; i/=10){
			int rem =i%10;
			switch(rem){
				case 1:
					str= "One "+str;
				break;
				case 2:
					str="Two "+str;
				break;
				case 3:
					str="Three "+str;
				break;
				case 4:
					str="Four "+str;
				break;
				case 5:
					str="Five "+str;
				break;
				case 6:
					str="Six "+str;
				break;
				case 7:
					str="Seven "+str;
				break;
				case 8:
					str= "Eight "+str;
				break;
				case 9:
					str= "Nine "+str;
				break;
				case 0:
					str= "Zero "+str;
				break;
			}
		}
		System.out.println(str);
	}
}