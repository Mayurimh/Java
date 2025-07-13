package arrays;

public class CrossElemetInArrays {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		
		int ans[] = crossElemArray(a,b);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}	
	}
	public static int[] crossElemArray(int[]a, int[]b) {
		int ans[] = new int[a.length+b.length];
		for(int i=0; i<ans.length; i++) {
			if(i<b.length) {
				ans[i] = b[i];
			}
			else {
				ans[i] = a[ans.length-i-1];
			}
		}
		return ans;
	}
}
