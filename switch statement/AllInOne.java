class AllInOne
{
	public static void main(String [] args){
		for(int i=1; i<=10; i++){
			System.out.print(i+ " ");
		}
		System.out.println();
		
		for(char i='a'; i<='z'; i++){
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		for(char i='A'; i<='Z'; i++){
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		for(char i='Z'; i>='A'; i--){
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		for(int i=0; i<=127; i++){
			System.out.println(i+ " : "+(char)i+ " " );
		}
		
		System.out.println();
		
		for(char ch = '0'; ch<='9' ; ch++){
			System.out.print(ch + " ");
		}
	}
}