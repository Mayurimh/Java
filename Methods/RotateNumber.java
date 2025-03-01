class RotateNumber
{
	public static void main(String[] args){
		int num =1234;
		System.out.println(rotateNumber(num));
	}
	public static int rotateNumber(int num){
		int rem=num % 10;
		num/=10;
		int cnt = count(num);
		int res = rem * power(10, cnt)+ num;
		return res;
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
}