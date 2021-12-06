package Inheritence;
//sub class of ClassA
public class ClassB extends ClassA {
	int val= 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    void nmb1() {
		
		System.out.println("This is a normal method 1 of classA");
	}
	void nmb2() {
		
		System.out.println("This is a normal method 2 of classA");
	}
	@Override
	void orverriddenmeth() {
		
		System.out.println("This is method to be over ridden of class B");
	}


}
