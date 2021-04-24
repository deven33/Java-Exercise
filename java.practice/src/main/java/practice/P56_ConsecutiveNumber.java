package practice;

public class P56_ConsecutiveNumber {
	public static void main(String[] args) {
		String str ="232425";// Consecutive  23 24 25    1234  1 2 3 4
		int flag = findConsecutive(str);
		if(flag!=-1) {
			System.out.println("Consicutive");
		}else {
			System.out.println("Non Consicutive");
		}
	}

	private static int findConsecutive(String str) {
		int num =str.length();
		int start;
		
		for (int i = 0; i < num/2; i++) {
			String strnum =str.substring(0,i+1);
			int newNum = Integer.valueOf(strnum);
			start= newNum;
			while (strnum.length()<num) {
				newNum++;
				strnum+=String.valueOf(newNum);
			}
			
			if(strnum.equals(str)) {
				return start;
			}
		}
		return -1;
	}

}
