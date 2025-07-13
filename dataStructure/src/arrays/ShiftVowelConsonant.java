package arrays;

import java.util.Arrays;

public class ShiftVowelConsonant {
	public static void main(String[] args) {
		char[] vowelConso = {'a','b','c','e','i','h','m','i','e','z'};
		System.out.println(Arrays.toString(shiftVowelConsonant(vowelConso)));
	}
	public static char[] shiftVowelConsonant(char[] vowelConso) {
		int i=0;
		int j=vowelConso.length-1;
		while(i<j) {
			while(vowelConso[i]=='a'||vowelConso[i]=='e'||vowelConso[i]=='i'||vowelConso[i]=='o'||vowelConso[i]=='u') {
				i++;
			}
			while(vowelConso[j]!='a'&&vowelConso[j]!='e'&&vowelConso[j]!='i'&&vowelConso[j]!='o'&&vowelConso[j]!='u') {
				j--;
			}
			if(i<j) {
				char temp = vowelConso[i];
				vowelConso[i] = vowelConso[j];
				vowelConso[j] = temp;
			}
		}
		return vowelConso;
	}
}
