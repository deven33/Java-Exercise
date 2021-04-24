package practice;

import java.util.Arrays;

public class P55_PlatformCount {
	public static void main(String[] args) {
		int arr[] = { 900, 901, 630, 760, 890, 230 };
		int dep[] = { 840, 950, 640, 300, 800 };
		Arrays.sort(arr);
		Arrays.sort(dep);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(dep));
		calulatePlateform(arr, dep);
	}

	private static void calulatePlateform(int[] arr, int[] dep) {
		int rst = 1;
		int plat = 1;
		int n = arr.length;
		int i = 1;
		int j = 0;
		while (i < n && j < n) {
			if (arr[i] <= dep[j]) {
				plat++;
				i++;
			} else if (arr[i] > dep[j]) {
				plat--;
				j++;
			}
		}
		if (plat > rst) {
			System.out.println("Plat:" + plat);
		}
	}
}
