package arrays;

public class SecondMinElem {
	public static void main(String[] args) {
		int[] a = {4,3,6,2,7,9};
		System.out.print(secMinElement(a));
	}
	public static int secMinElement(int a[]) {
		int secMin=Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				secMin = min;
				min = a[i];
			}
			else if(a[i]<secMin && a[i]!= min) {
				secMin = a[i];
			}
		}
		return secMin;
	}
}
