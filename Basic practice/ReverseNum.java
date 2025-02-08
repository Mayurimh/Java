import java.util.Scanner;

class ReverseNum
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(4 digit) : ");
		int num = sc.nextInt();
		
		int dup = num;
		int rev = 0;
		int rem=0;
		
		rem = dup%10; //step 1
		rev = rev * 10 + rem; // step 2
		dup = dup/10; //step 3
		
		rem = dup % 10 ;
		rev =rev * 10 + rem;
		dup = dup/10;
		
		rem = dup % 10;
		rev = rev* 10+ rem;
		dup = dup/10;
		
		rem = dup % 10;
		rev = rev* 10+ rem;
		//dup = dup/10;
		
		
		System.out.println("number : "+num);
		System.out.println("Reverse : "+rev);		
	}
}
