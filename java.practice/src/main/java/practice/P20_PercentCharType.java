package practice;

public class P20_PercentCharType {

	public static void main(String[] args) {
		String str= "My e-mail : eMail_Address321@anymail.com";
		int total_cnt = str.length();
		char[] ch = str.toCharArray();
		int upper_cnt=0;
		int lower_cnt=0;
		int digit_cnt=0;
		int other_cnt=0;
		for(Character c: ch) {
			if(Character.isUpperCase(c)) {
				upper_cnt++;
			}
			else if(Character.isLowerCase(c)) {
				lower_cnt++;
			}
			else if (Character.isDigit(c)) {
				digit_cnt++;
			}
			else {
				other_cnt++;
			}
		}
		
		double upper = (upper_cnt *100.0)/total_cnt;
		double lower = (lower_cnt *100.0)/total_cnt;
		double digit = (digit_cnt *100.0)/total_cnt;
		double other = (other_cnt *100.0)/total_cnt;
		
		System.out.println("Upper case % - "+upper);
		System.out.println("Lower case % - "+lower);
		System.out.println("Digit % - "+digit);
		System.out.println("Other case % -"+other);
	}

}
