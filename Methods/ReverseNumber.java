class ReverseNumber
{
	public static void main(String[] args){
		int num =1234;
		System.out.println(num);
		System.out.println(reverse(num));
	}
	public static int reverse(int num){
		int rev = 0;
		for(int i=num; i>0; i/=10){
			rev = rev * 10 + (i%10);
		}
		return rev;
	}
}