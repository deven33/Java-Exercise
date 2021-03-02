package practice;

import java.util.HashMap;

/*
 * count character in the String
 */
public class P12_Char_Count {

	public static void main(String[] args) {

		String str = "Java J2EE Java JSP j2EE";
		charcount(str);
	}

	private static void charcount(String str) {
		HashMap<Character, Integer> map = new HashMap();
		char[] ch = str.toCharArray();

		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);
	}

}
