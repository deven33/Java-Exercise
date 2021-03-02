package practice;

import java.util.Comparator;

public class P43_nameCompare implements Comparator<P43_Student> {

	public int compare(P43_Student s1, P43_Student s2) {
		
		return s1.name.compareTo(s2.name);
	}

}

class P43_idCompare implements Comparator<P43_Student> {

	public int compare(P43_Student s1, P43_Student s2) {
		
		return s2.id - s1.id;
	}

}
