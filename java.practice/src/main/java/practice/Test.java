package practice;

public class Test {
	public static void main(String[] args) {
		int n = 5;
	/*	1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5  */
		
		//pattern_1(n);
		
	/*	1 
		2 1 
		3 2 1 
		4 3 2 1 
		5 4 3 2 1  */
		
		//pattern_2(n);
		
	/*	A
		AB
		ABC
		ABCD
		ABCDE */
		
		//patteren_3(n);
		
	/*	ABCDE
		ABCD
		ABC
		AB
		A  */
		
		patteren_4(n);
	}

	private static void patteren_4(int n) {
		for (int i = n; i >= 1; i--) {
			char ch ='A';
			for(int j = 1; j<= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}		
	}

	private static void patteren_3(int n) {
		for (int i = 1; i <= n; i++) {
			char ch ='A';
			for(int j = 1; j<= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

	private static void pattern_2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	private static void pattern_1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
