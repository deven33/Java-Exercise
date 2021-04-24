package practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class P50_FileAppend {

	public static void main(String[] args) throws FileNotFoundException {
		FileWriter fw = null;
		FileReader fr = new FileReader("test.txt");
		try {
			fw = new FileWriter("D:\\Learnings Practice\\java\\core java\\Java-Exercise\\java.practice\\src\\main\\java\\test.txt", true);

			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println();
			pw.println("dev	:	123");
			pw.println("ametad	:	345");
			System.out.println("1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
