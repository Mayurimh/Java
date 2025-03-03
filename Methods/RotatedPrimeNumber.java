class RotatedPrimeNumber
{
	public static void main(String[]args){
		for(int i=1; i<=1000; i++){
			if(isRotatedPrime(i))
				System.out.println(i);
		}
	}
	public static int rotate(int num){
		int rem = num % 10;
		num/=10;
		int cnt = count(num);
		return (rem * power(10, cnt)+num);
	}
	public static int count(int num){
		int cnt = 0;
		for(int i=num; i>0; i/=10)
			cnt++;
		return cnt;
	}
	public static int power(int dig, int cnt){
		int pow = 1;
		for(int i=1; i<=cnt; i++){
			pow *= dig;
		}
		return pow;
	}
	public static boolean isPrime(int num){
		for(int den =2; den <num/2; den++){
			if(num%den == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isRotatedPrime(int num){
		if(isPrime(num)){
			int rot = rotate(num);
			while(rot!= num && isPrime(rot)){
				rot = rotate(rot);
			}
			return num==rot;
		}
		return false;
	}
}