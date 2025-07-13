package arrays;

public class MaxElement {
	public static void main(String [] args) {
		int[] a = {5,2,7,2,8,9,3,4};
		System.out.println("Maximum element : "+maxElementInArray(a));
	}
	public static int maxElementInArray(int[] a) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
}
