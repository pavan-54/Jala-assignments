package Strings;
//Searching in strings using indexOf()
import java.util.Scanner;

//Searching in strings using indexOf()
public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s ="Every day we started fighting\r\n"
				+ "Every night we fell in love\r\n"
				+ "No one else could make me sadder";
		System.out.println("Enter string to search: ");
		String se = sc.next();
		int var=s.indexOf(se);
		if(var!=-1) {
			System.out.println("string is present");
		}
		else {
			System.out.println("string is not present");
		}
		

	}

}
