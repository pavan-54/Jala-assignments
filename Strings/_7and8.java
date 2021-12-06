package Strings;
//Comparing strings using the methods equals(),
//equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
public class _7and8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "pavan";
		String b= "pavan";
		if(a.equals(b)) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("Not equal");
		}
		b="PAVAn";
		if(a.equalsIgnoreCase(b)) {
			System.out.println("They are equal ignoring case");
		}
		if(a.startsWith("pa")) {
			System.out.println("it statrs with pa");
		}
		if(a.endsWith("an")) {
			System.out.println("given string it ends with an");
		}
		int var =a.compareTo(b);
		System.out.println("The value from compare to is "+var);

	}

}
