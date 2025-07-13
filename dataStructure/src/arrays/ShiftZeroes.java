package arrays;

import java.util.Arrays;

public class ShiftZeroes {
	public static void main(String[] args) {
		int [] a = {1,0,2,3,5,0,0,8};
		System.out.println(Arrays.toString(shiftZeroAtEnd(a)));
	}
	public static int[] shiftZeroAtEnd(int[] a) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			while(a[i]>0) {
				i++;
			}
			while(a[j]==0) {
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


 