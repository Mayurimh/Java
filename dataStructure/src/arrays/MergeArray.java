package arrays;

public class MergeArray {
	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4};
		int[] ar2 = {5,6,7};
		
		int [] newArr = mergeArrays(ar1, ar2);
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr[i]+", ");
		}
	}
	public static int [] mergeArrays(int[] a1, int[] a2) {
		int[] newArr = new int[a1.length+a2.length];
		for(int i=0; i<newArr.length; i++) {
			if(i<a1.length) {
				newArr[i] = a1[i];
			}
			else {
				newArr[i] = a2[i-a1.length];
			}
		}
		return newArr;
	}
}
