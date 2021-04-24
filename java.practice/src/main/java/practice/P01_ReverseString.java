package practice;

public class P01_ReverseString {

	public static void main(String[] args) {
		String str = "deven";
		// byStringBuffer(str);
		// ByIterativeMethod(str);
		
		/*
		 * Using Recursive Method
		 */
		ByRecursive(str);
	}

	private static void ByRecursive(String str) {
		char[] ch = str.toCharArray();
		reverse(ch, 0);
		System.out.println(String.valueOf(ch));
	}

	private static void reverse(char[] ch, int i) {
		int n = ch.length;
		if (i == n / 2)
			return;
		swap(ch, i, n - i - 1);
		reverse(ch, i + 1);
	}

	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	static void byStringBuffer(String str) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.reverse());
	}

	static void ByIterativeMethod(String str) {
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
