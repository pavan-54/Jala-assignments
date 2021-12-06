package exceptions;

public class _16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	         int a = Integer.parseInt(null); //throws Exception as     //the input string is of illegal format for parsing as it is null.  
	    }    
	/*
	 * Exception in thread "main" java.lang.NumberFormatException: Cannot parse null string
	at java.base/java.lang.Integer.parseInt(Integer.java:630)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at Jala/exceptions._16.main(_16.java:7)

	 */

}
