package arrays;

public class MinElement {
	public static void main(String [] args) {
		int[] a = {5,2,7,2,8,-9,3,4};
		System.out.println("Manimum element : "+minElementArray(a));
	}
	public static int minElementArray(int[] a) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
}
