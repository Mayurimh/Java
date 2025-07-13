package arrays;

import java.util.Arrays;

public class shiftOddEven {
	public static void main(String[]args) {
		int[] a = {2,4,3,5,10,23,87};
		System.out.println(Arrays.toString(shiftOddEvenElement(a)));
	}
	public static int[] shiftOddEvenElement(int[]a) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			while(a[i]%2==0) {
				i++;
			}
			while(a[j]%2 !=0) {
				j--;
			}
			if(i<j) {
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}
		}
		return a;
	}
}
