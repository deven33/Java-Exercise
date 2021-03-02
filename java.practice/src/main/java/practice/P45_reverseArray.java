package practice;

import java.util.Arrays;

public class P45_reverseArray {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
		reverse(arr);
	}

	private static void reverse(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length/2; i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
