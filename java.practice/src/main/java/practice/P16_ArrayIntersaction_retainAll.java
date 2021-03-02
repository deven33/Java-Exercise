package practice;

import java.util.Arrays;
import java.util.HashSet;

public class P16_ArrayIntersaction_retainAll {

	public static void main(String[] args) {
		String[] s1 = { "a", "b", "g", "k", "t" };
		String[] s2 = { "f", "p", "a", "b", "h" };

		usingIterative(s1, s2);
		usingRetainAll(s1, s2);
	}

	private static void usingRetainAll(String[] s1, String[] s2) {
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(s1));
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(s2));

		set1.retainAll(set2);
		System.out.println(set1);
	}

	private static void usingIterative(String[] s1, String[] s2) {

		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}

		System.out.println(" interaaction");
		System.out.println(set);
	}

}
