package practice;

import java.io.IOException;

public class P21_ExternalApplicationLaunch {

	public static void main(String[] args) throws IOException {

		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad.exe");
	}

}
