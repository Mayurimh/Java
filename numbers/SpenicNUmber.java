class SpenicNUmber
{
	public static void main(String[] args){
		System.out.println(isSpenicNumber(66)); //30, 42, 66, 70, 78, 102, 105, 110, 114,
	}
	public static boolean isSpenicNumber(int num){
		int prod = 1;
		for(int i=2; i<=num/2; i++){
			if(num % i==0){
				if(isPrime(i)){
					prod *= i;
				}
				if(prod > num)
					return false;
			}
		}
		return prod == num;
	}
	public static boolean isPrime(int num){
		for(int i=2; i<=num/2 ; i++){
			if(num % i==0){
				return false;
			}
		}
		return true;
	}
}