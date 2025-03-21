class AllMathMethods
{
	public static void main(String[] args){
		System.out.println(power(2,3));
		System.out.println(prime(5));
		System.out.println(reverse(123));
		System.out.println(palindrome(127));
	}
	public static int power(int num, int pow){
		int res=1;
		for(int i=0; i<pow; i++)
			res *= num;
		return res;
	}
	public static boolean prime(int num){
		for(int i=2; i<=num/2; i++){
			if(num % i == 0)
				return false;
		}
		return true;
	}
	public static int reverse(int num){
		int res = 0;
		while(num>0){
			res = res * 10 + num %10;
			num/=10;
		}
		return res;
	}
	
	public static boolean palindrome(int num){
		int res = 0;
		int dup=num;
		while(num>0){
			res = res * 10 + num %10;
			num/=10;
		}
		return res==dup;
	}
}