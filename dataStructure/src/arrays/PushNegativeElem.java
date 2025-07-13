package arrays;

import java.util.Arrays;

public class PushNegativeElem {
	public static void main(String[] args) {
		int a[] = {1,-2,-3,4,-5,6,9,0};
		pushNegativeelems(a);
		System.out.print(Arrays.toString(a));
	}
	public static void pushNegativeelems(int[]a) {
		int i=0;
		for(int j=0; j<a.length; j++) {
			if(a[j]>=0) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
		}
	}
}
