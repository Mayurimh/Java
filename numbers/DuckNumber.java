class DuckNumber{
	public static void main(String[] args){
		for(int i=1; i<=1000; i++){
			if(isDuckNUmber(i))
				System.out.println(i);
		}
	}
	public static boolean isDuckNUmber(int num){
		for(int i= num; i>0; i/=10){
			if(i%10==0)
				return true;
		}
		return false;n
	}
}