package Strings;
//Converting Numbers to Strings with valueOf()
//Converting integer objects to Strings
//Converting to uppercase and lowercase
public class _12and13and14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		String s = String.valueOf(a);//coverted to string int value
		System.out.println("the int values converted to string "+s);//converted to stirng
		Integer i = new Integer(100);
		String ss= String.valueOf(i);
		System.out.println("The Integer object string value: "+ss);
		String abc = "this IS good";
		String upp = abc.toUpperCase();
		String low =abc.toLowerCase();
		System.out.println("upper case string is : "+upp);
		System.out.println("lower case string is : "+low);

	}

}
