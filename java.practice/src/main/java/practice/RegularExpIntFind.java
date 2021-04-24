package practice;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class RegularExpIntFind {
	 final int x;
    
     {
    	x = 10;
    }
    RegularExpIntFind(){
    	x=23;
    }
     int m(){
    	x=234;
    	return 1;
    }
     
     String m(int a) {
    	 return "dev";
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="deev";
		int a = (int) str.chars().filter(c-> c=='e').count();
		System.out.println(a);
		//Stream.map(1, n->n*2).limit(5).forEach(System.out::println);
		
		String []s =  {"321","dsh","d765","87","fd"};
		for(String s1: s) {
			//System.out.println(s1);
			if(Pattern.matches("[d]{1}[s]+.*", s1)) {
				System.out.println(s1);
			}
		}
		
		
		 new ArrayList().s
		
	}
	static void  a(String a1) {
		System.out.println("a1"+a1);
	}
	static void  a(Integer a1) {
		System.out.println("a1 int"+a1);
	}
	static void  a(char a1) {
		System.out.println("a1 char"+a1);
	}
}
