package practice;

public class P18_ReverseEachWordOfString {

	public static void main(String[] args) {

		String str = "Java Concept Of The Day";
		String[] st = str.split(" ");
		String rev = "";
		// taking each word and rev it
		for (String s : st) {
			StringBuffer sb = new StringBuffer(s);
			rev = rev + sb.reverse() + " ";
		}

		System.out.println(rev.trim());
		// avaJ tpecnoC fO ehT yaD
	}

}
