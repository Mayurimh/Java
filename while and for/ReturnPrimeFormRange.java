import java.util.Scanner;
class ReturnPrimeFormRange
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting range : ");
		int rang1 = sc.nextInt();
		
		System.out.print("Enter ending range : ");
		int rang2 = sc.nextInt();
		int j;
		while(rang1 <= rang2){
			for(j=2; j<rang1 ; j++){
				if(rang1 % j == 0){
					rang1++;
					break;
				}
			}
			if(j==rang1){
				System.out.print(rang1+" ");
				rang1++;
			}
		}
		
	}
}