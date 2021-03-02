package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * Duplicate removal from arrayList
 */
public class P14_DuplicateRemovefromArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("SERVLETS");
		list.add("JAVA");
		list.add("STRUTS");
		list.add("JSP");
		System.out.println("Before remove");
		System.out.println(list);
		// Using HashSet
		// HashSet<String> set = new HashSet(list);

		// USeing LisnkedHashSet
		LinkedHashSet<String> set = new LinkedHashSet<String>(list);

		ArrayList<String> out = new ArrayList<String>(set);
		System.out.println("After removal");
		System.out.println(out);

	}

}
