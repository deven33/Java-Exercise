package practice;

public class P48_removeDuplicatefromArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 5, 4, 7, 1, 4 };
		removeDuplicate(arr);
	}

	private static void removeDuplicate(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				arr[i]=arr[i+1];
			}
		}
	}

}
