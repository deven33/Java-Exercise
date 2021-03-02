package practice;

public class P015_CheckBinary {

	public static void main(String[] args) {
		int n = 10111120;

		checkBinay(n);
	}

	private static void checkBinay(int n) {
		int copy = n;
		boolean isBinary = true;

		while (copy != 0) {
			int d = copy % 10;
			if (d > 1) {
				isBinary = false;
				break;
			} else {
				copy = copy / 10;
			}
		}

		if (isBinary) {
			System.out.println("Binary Number");
		} else
			System.out.println("Non Binary");
	}

}
