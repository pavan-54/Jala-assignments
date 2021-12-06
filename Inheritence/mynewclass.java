package Inheritence;

public class mynewclass extends ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mynewclass().mynewmeth();
	}
	void mynewmeth() {
		 System.out.println("-------------");
			System.out.println("over riding values of class B with refernce to super class");
			System.out.println((((ClassB)this).val));
			System.out.println("over riding values of class C with refernce to super class");
			System.out.println((((ClassC)this).val));
	}

}
 