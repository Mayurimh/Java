package arrays;

public class CrossArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		
		int ans[] = crossArray(a,b);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}	
	}
	public static int[] crossArray(int[]a, int[]b) {
		int ans[] = new int[a.length+b.length];
		for(int i=0; i<ans.length; i++) {
			if(i<b.length) {
				ans[i] = b[i];
			}
			else {
				ans[i] = a[a.length-(ans.length-i)];
			}
		}
		return ans;
	}
}

