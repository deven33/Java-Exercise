package test;

import java.lang.StackWalker.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> list = Stream.of(1, 6, 3, 5, 8);
		Optional<Integer>  l = list.reduce(Math::max);
		System.out.println(l);
		
		
	}

}
