package arrays;

public class SecondMaxElement {
	public static void main(String [] args) {
		int[] a = {5,2,7,2,8,-9,8,4};
		System.out.println("second Maximum element : "+secondMaxElem(a));
	}
	public static int secondMaxElem(int[] a){
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				secMax = max;
				max = a[i];
			}
			else if(a[i]>secMax && a[i]!=max) {
				secMax = a[i];
			}
		}
		return secMax;
	}
}