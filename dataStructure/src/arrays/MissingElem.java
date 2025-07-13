package arrays;

public class MissingElem {
	public static void main(String[] args) {
		int a[] = {1,2,3,5,6};
		int n =6;
		System.out.println(missingElementsVer1(a));	
		System.out.println(missingElementsVer2(a,n));	
	}
	public static int missingElementsVer1(int a[]) {
		for(int i=0 ; i<a.length; i++) {
			if(a[i+1] != a[i]+1) {
				return a[i]+1;
			}
		}
		return 0;
	}
	
	public static int  missingElementsVer2(int[]a, int n) {
		int totalElemSum = n*(n+1)/2;
		int arrElemSum = 0;
		for(int i=0; i<a.length; i++) {
			arrElemSum += a[i];
		}
		return totalElemSum-arrElemSum;
	}
}
