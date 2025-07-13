package arrays;

public class FindElement {
	public static boolean isKeyPresnt(int[] arr,int key) {
		for(int i=0; i<arr.length; i++) {
			if(key == arr[i]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int [] ar = {2,3,5,6,8,9,90};
		int key = 6;
		if(isKeyPresnt(ar,key)) {
			System.out.println("Key is present");
		}
		else
			System.out.println("Key is not present");
	}
}
