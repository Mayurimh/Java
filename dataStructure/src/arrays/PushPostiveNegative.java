package arrays;

public class PushPostiveNegative {
	public static void main(String[]args) {
		int[]a = {1,-2,3,-4,0,-5,7};
		pushAllPostNeg(a);
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void pushAllPostNeg(int [] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1;j<a.length; j++ ) {
				if(a[i]<0 && a[j]>0) {
					int temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
			}
		}
	}	
}
