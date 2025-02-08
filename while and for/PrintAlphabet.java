class PrintAlphabet{
	public static void main(String [] ar){
		// for upper case
		char i =65;
		//while(i<=90){
			//System.out.println(" "+ i);
			//i++;
		//}
		
		//for lowercase 
		char j =97;
		//while(j<=122){
			//System.out.println(" "+ j);
			//j++;
		//}
		
		//for combine 
		
		while(i<=90 && j <=122){
			System.out.println(" "+ i+ " =>  "+j);
			i++;
			j++;
		}
	}
}