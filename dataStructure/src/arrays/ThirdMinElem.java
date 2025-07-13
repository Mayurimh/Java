package arrays;

public class ThirdMinElem {
	public static void main(String[] args) {
		int a[] = {-1, 9,-8,1};
		System.out.println("Third Mininmum element :"+thirdMinElem(a));
	}
	public static int thirdMinElem(int[]a) {
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				thirdMin = secMin;
				secMin = min;
				min = a[i];
			}
			else if (a[i] < secMin && a[i] != min) {
                thirdMin = secMin;
                secMin = a[i];
            } else if (a[i] < thirdMin && a[i] != secMin && a[i] != min) {
                thirdMin = a[i];
            }
		}
		return thirdMin;
	}
}
