package arrays;

public class ZigZagArray {
	public static void main(String[]args) {
		int a1 [] = {1,2,5};
		int a2[] = {6,7,8,89,0,8};
		int [] newAr = zigZagArray(a1,a2);
		for(int i=0; i<newAr.length; i++) {
			System.out.print(newAr[i]+" ");
		}
	}
	public static int[] zigZagArray(int a1[], int [] a2) {
		int[] newArr = new int[a1.length+a2.length];
		int i=0, mem=0;
		while(i<a1.length||i<a2.length) {
			if(i<a1.length) {
				newArr[mem++]= a1[i];
			}
			if(i<a2.length) {
				newArr[mem++]= a2[i];
			}
			i++;
		}
		return newArr;
	
	}
}
