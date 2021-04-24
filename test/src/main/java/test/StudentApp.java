package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student(1, "dev");
		Student student2 = new Student(2, "ameta");

		List<Student> list = Arrays.asList(student, student2);

		// List<Object> out = list.stream().sorted((i1,
		// i2)->i2.getId()-(i1.getId())).collect(Collectors.toList());
		// System.out.println(out.toString());
		// System.out.println(list.stream().limit(2).collect(Collectors.toList()));

		// int findFirst = Stream.iterate(0, n->n+2).filter(p-> p > 10).findFirst();
		// System.out.println(findFirst);

		List<Integer> list1 = Arrays.asList();

		// Optional<Integer> rst = list1.stream().reduce((a,b)-> a*b);
		// System.out.println(rst);
		List<String> numbers = new ArrayList();
		;
		;
		// Arrays.asList("2","3","4","5","2");
		numbers.add("3");
		numbers.add("2");
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		System.out.println(numbers);
		numbers.removeIf(i -> i.equals("2"));

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 8);
		map.put(3, 4);

		System.out.println(map);

		Integer n = map.entrySet().stream().max((v1, v2) -> v1.getValue() > v2.getValue() ? 1 : -1).get().getValue();
			System.out.println(n);
		boolean flag = Pattern.matches("\\D{1,}", " afgdssde");
		System.out.println(flag);
		// int []a = {2,4,2,5,3,4};
		// int even =
		// Arrays.stream(a).filter(i -> !uni).reduce(0,(ans,i)-> ans+i);

		// System.out.println(even);

//			   Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//			   map.put(1,5);
//			   map.put(1,4);
//			   System.out.println(map);

	}

}
