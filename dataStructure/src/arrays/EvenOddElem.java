package arrays;

public class EvenOddElem {
	public static void sumOfevenAndOddElem(int[]ar) {
		int sumEven =0;
		int sumOdd = 0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
				sumEven+=ar[i];
			}
			else
				sumOdd += ar[i];
		}
//		System.out.println("Sum of even elements in array : "+sumEven);
//		System.out.println("Sum of odd elements in array : "+sumOdd);
		if(sumEven == sumOdd) {
			System.out.println("Sum of even and odd elements in array is same");
		}
	}
	public static void main(String[]args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		sumOfevenAndOddElem(arr);
	}
}
