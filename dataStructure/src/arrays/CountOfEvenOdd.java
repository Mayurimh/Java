package arrays;

public class CountOfEvenOdd {
	public static void countOfevenAndOddElem(int[]ar) {
		int countEven =0;
		int countOdd = 0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
				countEven++;
			}
			else
				countOdd ++;
		}
		System.out.println("Count of even elements in array : "+countEven);
		System.out.println("Count of odd elements in array : "+countOdd);
	}
	public static void main(String[]args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		countOfevenAndOddElem(arr);
	}
}
