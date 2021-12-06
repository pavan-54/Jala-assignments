package exceptions;

import java.io.FileInputStream;

public class _12 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream inputStream = new FileInputStream("file.txt");

	}
	/*
	 * Exception in thread "main" java.io.FileNotFoundException: file.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	at Jala/exceptions._12.main(_12.java:9)

	 */

}
