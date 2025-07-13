package arrays;

public class CountOfKey {
	public static int countKey(int[] ar,int key) {
		int count =0;
		for(int i =0; i<ar.length; i++) {
			if(key == ar[i])
				count ++;
		}
		return count;
	}
	public static void main(String[] args) {
		int ar[] = {1,2,2,4,2,4,5,5,6};
		int key = 2;
		System.out.println("Count of key : "+countKey(ar,key));
	}
}
