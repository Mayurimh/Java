class SunnyNumber
{
	public static void main(String[] args){
		for(int i = 1; i<=100; i++){
			if(isSunnyNum(i)){
				System.out.println(i);
			}
		}
	}
	public static boolean isSunnyNum(int num){
		int newNum = num+1;
		for(int i =1; i<=newNum/2; i++){
			if(i*i == newNum)
				return true;
		}
		return false;
	}
}