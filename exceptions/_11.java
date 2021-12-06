package exceptions;

import java.io.File;
import java.io.FileReader;

public class _11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader("file.txt");
		
		/*
		 * Exception in thread "main" java.io.FileNotFoundException: file.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	at java.base/java.io.FileReader.<init>(FileReader.java:60)
	at Jala/exceptions._11.main(_11.java:10)

		 */

	}

}
