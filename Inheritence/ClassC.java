package Inheritence;
//sub class of Class B
public class ClassC extends ClassB {
	int val=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    void nmc1() {
		
		System.out.println("This is a normal method 1 of classA");
	}
	void nmc2() {
		
		System.out.println("This is a normal method 2 of classA");
	}
	@Override
	void orverriddenmeth() {
		System.out.println("This is method to be over ridden of Class C");
	}


}
