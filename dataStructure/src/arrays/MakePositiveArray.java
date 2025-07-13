package arrays;

import java.util.Arrays;

public class MakePositiveArray {
	public static void main(String[] args) {
		int a[] = {1,-2,3,-4,5,6};
		makePostiveArray(a);
		System.out.print(Arrays.toString(a));
	}
	public static void makePostiveArray(int[]a) {
		for(int i=0; i<a.length; i++) {
			if(a[i]<0)
				a[i]*=-1;
		}
	}
}
