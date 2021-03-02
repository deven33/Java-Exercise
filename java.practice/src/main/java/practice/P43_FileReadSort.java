package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class P43_FileReadSort {
	
	FileReader fread= new FileReader("C:\test.txt");
	BufferedReader reader = new BufferedReader(fread);
	ArrayList<P43_Student> students = new ArrayList<P43_Student>();
	String currentLine = reader.readLine();
	
}
