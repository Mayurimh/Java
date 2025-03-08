class LazyNumberSequence
{
	public static void main(String[] args){
		lazyNumSequence(15);
	}
	public static void lazyNumSequence(int num){
		int sum = 1; 
		for(int i=0; i<=num; i++){
			sum += i;
			System.out.print(sum+" ");
		}
	}
}