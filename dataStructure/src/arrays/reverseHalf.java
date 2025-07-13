package arrays;

public class reverseHalf {
	public static int[] halfReverse(int arr[]) {
		int arrlen=arr.length;
		int [] newArr = new int[arrlen/2+1];
		for(int i=arrlen/2; i<arrlen; i++ ) {
			newArr[arrlen - 1-i] = arr[i];
		}
		for(int i=(arrlen/2); i<arrlen; i++) {
			arr[i]=newArr[i-(arrlen/2)];
		}
		return arr;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,8};
		int[]newArr = halfReverse(a);
		for(int i = 0; i<newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}
}
