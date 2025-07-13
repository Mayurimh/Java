package arrays;

public class ThirdElement {
	public static void main(String[]args) {
		int[] a = {9,8,-6,-5,3,2};
		System.out.println("Third Maximum element : "+thirdElementInArray(a));
	}
	public static int thirdElementInArray(int a[]) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdElem = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				thirdElem = secMax;
				secMax = max;
				max = a[i];
			}
			else if(a[i]>secMax && a[i]!=max) {
				thirdElem = secMax;
				secMax = a[i];
			}
			else if(a[i]>thirdElem && a[i]!= secMax && a[i]!= max)
			{
				thirdElem = a[i];
			}
		}
		return thirdElem;
	}
}
