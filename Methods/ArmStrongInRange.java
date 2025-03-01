class ArmStrongInRange
{
	public static void main(String[] args){
		for(int i=1; i<=10000; i++){
			if(isArmStrong(i))
				System.out.println(i);
		}
	}
	public static boolean isArmStrong(int num){
		int cnt = count(num);
		int sum = 0;
		for(int i=num; i>0; i/=10){
			int rem = i%10;
			sum +=power(rem,cnt);
		}
		return sum==num;
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