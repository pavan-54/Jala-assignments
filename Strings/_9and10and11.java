package Strings;
//Trimming strings with trim()
//Replacing characters in strings with replace()
//Splitting strings with split()
public class _9and10and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     Pavan Kalyan is good Programmer     ";
		System.out.println("With out trim "+s);
		System.out.println("With trim "+s.trim());//using trim
		String newstring = s.replace('a','d');//replaing 
		System.out.println(newstring);
		String b="Pavan@Kalyan@Ravi@Ram";
		String[] arrofstr =b.split("@");//split method
		for(String c:arrofstr) {
			System.out.println(c);
		}

	}

}
