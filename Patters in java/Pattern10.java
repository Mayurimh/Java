class Pattern10
{
	public static void main(String[] a){
		for(int i=1; i<=5; i++){
			for(int j=1;j<=i; j++){
				System.out.print("* ");
			}

			System.out.println();
		}
		for(int i=4; i>=1; i--){
			for(int j=1;j<=i; j++){
				System.out.print("* ");
			}
			
			System.out.println();
	}}
}