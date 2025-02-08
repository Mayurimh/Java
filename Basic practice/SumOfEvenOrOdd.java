class SumOfEvenOrOdd
{
	public static void main(String [] args){
		int num = 7234;
		
		int rem;
		int evenSum =0;
		int oddSum =0;
		int temp =0 ;
		rem = num % 10;
		temp =(rem %2 == 0)?(evenSum =evenSum + rem ): (oddSum = oddSum+ rem);
		num =num/10;
		
		rem = num % 10;
		temp =(rem %2 == 0)?(evenSum = evenSum + rem ): (oddSum = oddSum+ rem);
		num =num/10;
		
		rem = num % 10;
		temp =(rem %2 == 0)?(evenSum = evenSum + rem ): (oddSum = oddSum+ rem);
		num =num/10;
		
		rem = num % 10;
		temp =(rem %2 == 0)?(evenSum= evenSum + rem ): (oddSum =oddSum+ rem);
		
		
		System.out.println("even sum "+evenSum);
		System.out.println("Odd sum "+oddSum);
		
	}
}