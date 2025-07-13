package arrays;

public class ArrayPalindrome {
	public static boolean checkPalindrome(int[] ar) {
		int i=0;
		int j=ar.length-1;
		while(i<j) {
			if(ar[i]==ar[j]) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return i>=j;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1};
		if(checkPalindrome(arr)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
