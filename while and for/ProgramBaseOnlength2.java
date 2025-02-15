import java.io.*;
import java.util.*;
import java.util.Scanner;
class ProgramBaseOnlength2
{
	public static void main(String [] agrs){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		System.out.println("number before changes : "+num);
		int cnt = 0;
		
		// convert Integer to String
		String numStr = Integer.toString(num);
		
		String newString ="";
		//System.out.println(numStr);
		int size = numStr.length();
		System.out.println(size);
		if(size % 2==0){
			for(int i=0; i< size; i++){
				int digit = Character.getNumericValue(numStr.charAt(i));
				if(digit % 2!=0){
					digit +=1;
					newString = newString + digit;
				}else newString = newString + digit;
			}
		}
		else{
			for(int i=0; i< size; i++){
				int digit = Character.getNumericValue(numStr.charAt(i));
				if(digit % 2==0){
					digit +=1;
					newString = newString + digit;
				}else newString = newString + digit;
			}
		}
		int result = Integer.parseInt(newString);
		System.out.println("Final result is :"+result);
	}
}

