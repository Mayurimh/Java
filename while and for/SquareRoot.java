import java.util.Scanner;
class SquareRoot
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num =sc.nextInt();
		int op=0;
		for(int i=1; i<=num; i++){
			if(i*i ==num){
				op=i;
				break;
			}
		}
		if(op!=0){
			System.out.println("square root "+num+" is "op);
		}
		else{
			System.out.println("not perfect square");
		}
		
		//System.out.println((int)(Math.pow(num,(0.5))));
	}
}