package arrays;

public class ReverseTwoArrMerge {
	public static void main(String[]args) {
		int a1 [] = {1,2,3,4,5};
		int a2[] = {6,7,8,9,0,1,2,3};
		int [] newAr = reverseTwoArray(a1,a2);
		for(int i=0; i<newAr.length; i++) {
			System.out.print(newAr[i]+" ");
		}
	}
	public static int[] reverseTwoArray(int a1[], int [] a2) {
		int[] newArr = new int[a1.length+a2.length];
		for(int i=0; i<newArr.length; i++) {
			if(i<a1.length) {
				newArr[i] = a1[a1.length-1-i];
			}
			else {
				newArr[i] = a2[newArr.length - i-1];
			}
		}
		return newArr;
	}
}