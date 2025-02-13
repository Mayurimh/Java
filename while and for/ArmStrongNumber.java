import java.util.Scanner;
class ArmStrongNumber
{
	public static void main(String [] a){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int len = 0;
		for(int i = num ; i>0; i/=10){
			len++;
		}
		int sum =0;
		int dup =num;
		while(dup > 0){
			int pro = 1;
			int rem = dup % 10;
			for(int i=1; i<=len; i++){
				pro *=rem; 
			}
			sum += pro;
			dup/=10;
		}
		
		System.out.println(num==sum?num+" is Armstrong number.":num+ " in Not Armstrong number.");
	}
}