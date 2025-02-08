import java.util.Scanner;
class EVM
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int bjp =0 , con=0, ss = 0, nota=0;
		System.out.println(" ******************WELCOME*******************");
		System.out.println();
		System.out.println("Enter population : ");
		int pop= sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("List of Parties");
		System.out.println();
		System.out.println("1. BJP");
		System.out.println("2. CONGRESS");
		System.out.println("3. SHIV SHENA");
		System.out.println("4. NOTA");
		System.out.println();
		
		for(int i =0 ; i < pop; i++){
			System.out.println("Enter your vote : ");
			int v = sc.nextInt();
			
			if(v >=1 && v<=4){
				if(v == 1){
					bjp++; 
					System.out.println("BJP");
				}
				if(v == 2){con++; System.out.println("CONGRESS");}
				if(v == 3){ss++; System.out.println("SHIV SHENA");}
				if(v == 4){nota++; System.out.println("NoTA");}
			}
			if(!(v >=1 && v<=4)){
				i--;
				System.out.println("Invalid Vote ..");
			}
		}
		
		if(bjp >= con && bjp>= ss && bjp >= nota){
			System.out.println("BJP is win with "+ bjp+ " votes");
			return;
		}
		if(con >= bjp&& con>= ss && con >= nota){
			System.out.println("CONGRESS is win with "+ con+ " votes");
			return;
		}
		if(ss >= bjp && ss>= con && ss >= nota){
			System.out.println("SHIV SHENA is win with "+ ss+ " votes");
			return;
		}
		if(nota >= con && nota>= ss && nota >= bjp){
			System.out.println("NOTA is win with "+ nota+ " votes");
			return;
		}
	}
}