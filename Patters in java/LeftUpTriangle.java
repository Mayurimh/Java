class LeftUpTriangle
{
	public static void main(String[] args){
		int row = 4;
		for(int i=1; i<=row; i++){
			for(int k=1; k<i; k++){
				System.out.print(" ");
			}
			for(int j=i; j<=row;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}