import java.util.Scanner;
class CognizantQuestion1
{
	public static void main(String[] a){
		//String str[]  = ['i','a','b','b','a','b','a','a','i','i','i'];
		String  str = "iabbbaaiii";
		int lenA = 0;
		int lenB =0;
		int lenI =0;
		
		for(int i =0 ; i<str.length(); i++){
			if(str.charAt(i)=='i'){
				lenI++;
			}else if(str.charAt(i)=='a'){
				lenA++;
			}
			else{
				lenB++;
			}
		}
		lenI=str.length()-lenI;
		lenA=str.length()-lenA;
		lenB=str.length()-lenB;
		
		int finLen = (lenI<lenA)&&(lenI<lenB)? lenI: (lenA<lenB?lenA:lenB);
		System.out.println("Mininum number of operations : "+finLen);
	}
}