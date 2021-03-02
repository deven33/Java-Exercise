package javaexcrcise;

import java.util.Arrays;

public class TwoArrayEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		iterativeWay();
		arryEqualWay();
		
		//Same elements irrespective positions
		//first sort then compare
		arrayAllElement();
}

	private static void iterativeWay() {
		int [] a = {1,2,4,7};
		int []b = {1,2,4};
		boolean equal=true;
		if(a.length == b.length) {
			for(int i=0; i<a.length ; i++) {
				if(!(a[i]==b[i])) {
					equal = false;
				}
			}
		}
		if(equal && a.length == b.length ) {
			System.out.println("Equal Array");
		}
		else System.out.println("Not Equal Array");
	}
	
	private static void arryEqualWay() {
		int [] a = {1,2,4,7};
		int []b = {1,2,7,4};
		
		if(Arrays.equals(a, b)) {
			System.out.println("Equal Array");
		}
		else System.out.println("Not Equal Array");
	}
	
	private static void arrayAllElement() {
		int [] a = {1,2,4,7};
		int [] b = {1,2,7,4};
		//first sort then compare
		Arrays.sort(a);//
		Arrays.sort(b);//
		if(Arrays.equals(a, b)) {
			System.out.println("Equal Array");
		}
		else System.out.println("Not Equal Array");
	}
}