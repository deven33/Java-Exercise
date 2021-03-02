package practice;

import java.util.Arrays;

public class P20_SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 3, 9, 2 };
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
