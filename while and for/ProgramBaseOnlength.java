import java.util.Scanner;
class ProgramBaseOnlength
{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("number before changes : "+num);
		int cnt = 0;
		int dup = num;
		
		//count length of number
		while(num > 0){
			cnt++;
			num /=10;
		}
		
		//check length is even or odd
		int demo =0;
		if(cnt % 2==0){
			while(dup>0){
				int rem = dup % 10;
				
				//if number == 9
				if (rem==9)rem -=1;
				if(rem % 2 != 0)rem+=1;
				demo = demo * 10 + rem;
				dup /= 10;
			}
			System.out.println(demo);
		}
		else{
			while(dup>0){
				int rem = dup % 10;
				if(rem % 2 == 0) rem -=1;
				demo = demo * 10 + rem;
				dup /= 10;
			}
			System.out.println(demo);
		}
		int result =0;
		while(demo > 0){
			int rem = demo % 10;
			result =result * 10 + rem;
			demo /= 10;
		}
		System.out.println("number after changes : "+result);
	}
}