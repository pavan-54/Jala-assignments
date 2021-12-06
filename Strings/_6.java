package Strings;
import java.util.regex.*;
//Matching a String Against a Regular Expression With matches()
public class _6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String patternstr="test";
		Pattern p= Pattern.compile(patternstr);
		String input = "this fails";
		input= "this passes the test";
		Matcher m = p.matcher(input);
		boolean matchfound = m.matches();
		System.out.println(input +" - matches: " +matchfound);
		
	}

}
