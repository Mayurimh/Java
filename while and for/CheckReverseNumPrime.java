/* Emirp numbers : the number and reverse of that number are both prime number are called Emirp number..*/
import java.util.Scanner;
class CheckReverseNumPrime
{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup=num;
		int rev =0;
		while(dup>0){
			int rem = dup % 10;
			rev= rev* 10 + rem;
			dup/=10;
		}
		
		System.out.println("reverse of "+num+" is "+rev);
		
		//code for check the number is prime or not
		int den=2;
		String numPrime ="";
		//boolean numPrime = false;
		while (den<num)
		{
			if(num % den ==0){
				break;
			}
			den++;
		}
		if(num == den) numPrime = "Prime";
		
		// code for check the reverse number is prime or not
		//boolean revPrime =false;
		String revPrime ="";
		den = 2;
		while(den < rev){
			if(rev % den == 0){
				break;
			}
			den++;
		}
		if(rev == den) revPrime = "Prime";
		
		System.out.println(revPrime);
		System.out.println(numPrime);
		
		if(revPrime!="" && (revPrime.equals(numPrime))){
			System.out.println("Number are Emirp");
		}
		else{
			System.out.println("Number are not Emirp");
		}
		
	}
}