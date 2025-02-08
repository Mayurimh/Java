import java.util.Scanner;
class FinancialApp
{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the subtotal : ");
		float subTotal = sc.nextFloat();
		
		System.out.print("Enter the tiprate : ");
		float tipRate = sc.nextFloat();
		
		float gratuity = (tipRate/100) * subTotal;
		float total = gratuity+ subTotal;
		
		System.out.println("gratuity : "+gratuity);
		System.out.println("total : "+total);
	}
}