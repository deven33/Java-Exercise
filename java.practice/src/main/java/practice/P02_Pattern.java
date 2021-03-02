package practice;

public class P02_Pattern {

	public static void main(String[] args) {
		int n = 5;
/*
	     	1
		   2 2
		  3 3 3
		 4 4 4 4
		5 5 5 5 5
*/
		createPattern1(n);
	}

	private static void createPattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= i; k++) {
				System.out.print(k);
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

	}

}
