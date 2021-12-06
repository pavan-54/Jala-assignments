package exceptions;

public class _17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		      String str = "Hello how are you";
		      System.out.println("Length of the String: "+str.length());
		      for(int i=0; i<str.length(); i++) {
		         System.out.println(str.charAt(i));
		      }
		      //Accessing element at greater than the length of the String
		      System.out.println(str.charAt(40));
		   }
		
	/*
	 * Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 40
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1512)
	at Jala/exceptions._17.main(_17.java:15)
	 */

}
