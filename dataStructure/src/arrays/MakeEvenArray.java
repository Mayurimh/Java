package arrays;
import java.util.Arrays;

public class MakeEvenArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		makeEvenArray(a);
		System.out.print(Arrays.toString(a));
	}
	public static void makeEvenArray(int[]a) {
		for(int i=0; i<a.length; i++) {
			if(a[i]%2 != 0) {
				a[i] += 1;
			}
		}
	}
}
