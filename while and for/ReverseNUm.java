import java.util.Scanner;
class ReverseNUm
{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rev =0;
        if(num<0){
            num =num * (-1);
            while(num>0){
                int rem = num%10;
                rev =rev *10 +rem;
                num/=10;
            }
            rev = rev *(-1);
            System.out.println(rev);
        }
        else{
            while(num>0){
            int rem = num%10;
            rev =rev *10 +rem;
            num/=10;
            }
            System.out.println(rev);
        }   
	}
}