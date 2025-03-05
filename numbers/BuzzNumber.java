class BuzzNumber{
	public static void main(String[] args){
		for(int i = 1; i<=100; i++){
			if(isBuzzNum(i))
				System.out.println(i);
		}
	}
	public static boolean isBuzzNum(int num){
		if(num % 5 == 0)
			return true;
		return false;
	}

}