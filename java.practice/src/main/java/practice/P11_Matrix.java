package practice;

public class P11_Matrix {

	public static void main(String[] args) {
// For SUM
//		int[][] a = { { 5, 4 }, { 8, 6 }, { 1, 3 } };
//		int[][] b = { { 9, 2 }, { 8, 6 }, { 3, 0 } };

		// matrix_sum(a, b);

		int[][] a = { { 7, 6, 1 }, { 2, 3, 8 } };
		int[][] b = { { 4, 9 }, { 1, 7 }, { 3, 8 } };
		matrix_multiplication(a, b); // i*j 2*3 k*i 3*2--> output j*i 3*2

	}

	private static void matrix_multiplication(int[][] a, int[][] b) {
		int multi[][] = new int[3][2];
		for (int i = 0; i < a[i].length; i++) {
			for (int j = 0; j < b[].length; j++) {
				for (int k = 0; k < 2; k++)
					multi[i][j] += a[i][k] * b[k][j];
			}
		}

		System.out.println("Multi is::");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(multi[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void matrix_sum(int[][] a, int[][] b) {
		int sum[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("Sum is::");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
