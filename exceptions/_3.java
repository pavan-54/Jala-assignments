package exceptions;

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _3().throwingexception();//calling mehtod

	}
	void throwingexception() {//method that throws exception
		int a =10/0;
	}
	/*
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Jala/exceptions._3.throwingexception(_3.java:11)
	at Jala/exceptions._3.main(_3.java:7)
	 */

}
