package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class P90_JDBCSingleton {

	private static P90_JDBCSingleton instance;
	
	public static getInstance() {
		if (instance == null) {
			instance = new P90_JDBCSingleton();
		}
	}

}
