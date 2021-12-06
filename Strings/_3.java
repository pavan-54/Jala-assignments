package Strings;
//Finding the length of the string
public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Pavan Kalyan";
		System.out.println("the length is "+len(s));
		System.out.println("the length is : "+s.length());

	}
	static int len(String s) {
		int l=0;
		for(char c:s.toCharArray()) {
			l++;
		}
		return l;
	}

}
