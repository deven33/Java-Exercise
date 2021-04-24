package practice;

public class P49_MagicNumber {

	/*
	 * Magic number is a number which gives sum exactly 1 when its digits are
	 * recursively added. 1252 -> 1 + 2 + 5 + 2 = 10 -> 1 + 0 = 1
	 */
	public static void main(String[] args) {
		int a = 12512;
		int sum_digit= digit_sum(a);
		System.out.println(sum_digit);
		int sum_sum_digit = digit_sum(sum_digit);
		if(sum_sum_digit==1) {
			System.out.println("Magic");
		}
		else {
			System.out.println("Non");
		}
	}

	private static int digit_sum(int a) {
		int sum =0;
		int rem;
		while(a!=0) {
			
			rem= a%10;
			sum+=rem;
			a=a/10;
		}
		return sum;
	}

}
