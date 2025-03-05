class SpyNumber
{
	public static void main(String[] args){
		for(int i = 1; i<=100; i++){
			if(isSpyNumber(i))
				System.out.println(i);
		}
	}
	public static boolean isSpyNumber(int num){
		int sum = 0;
		int prod = 1;
		for(int i= num; i>0; i/=10){
			sum += num%10;
			prod *= num%10;
		}
		if(sum==prod)
			return true;
		return false;
	}
}