package practice;

public class P19_RevAddTillGetPalindrom {

	public static void main(String[] args) {
		int num = 12349;
		boolean flag;
		int rev = getReverse(num);
		System.out.println("rev:" + rev);
		int sum = num+rev;
		System.out.println("Sum:"+sum);
		int rev_sum = getReverse(sum);
		if(sum == rev_sum)
			System.out.println("True");
		else
			System.out.println("flase");
	}

	private static int getReverse(int num) {
		int rem = 0;
		int rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

}
