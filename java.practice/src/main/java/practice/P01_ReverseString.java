package practice;

public class P01_ReverseString {

	public static void main(String[] args) {
		String str = "deven";
		byStringBuffer(str);
		
		ByIterativeMethod(str);
	}

	static void byStringBuffer(String str) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.reverse());
	}
	
	static void ByIterativeMethod(String str) {
		char [] ch = str.toCharArray();
		for(int i=ch.length-1 ; i>= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
