package javaexcrcise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCharCount {
	public static void main(String[] args) {
		 Map<Character, Integer> stringInfo = new HashMap();
		 String string = "Butter Better";
		 //Convert String to charArray
		 char [] charArray = string.toCharArray();
		 for(Character ch : charArray) {
			 if( stringInfo.containsKey(ch)) {
				 stringInfo.put(ch, stringInfo.get(ch)+1 );
			 }
			 else {
				 stringInfo.put(ch, 1);
			 }
		 }
		 //Get All Key
		 Set<Character> charInString = stringInfo.keySet();
		 for(Character ch : charInString) {
			 if(stringInfo.get(ch)>1 ) {
				 System.out.println(ch+":"+stringInfo.get(ch));
			 }
		 }
		 
	}
}
