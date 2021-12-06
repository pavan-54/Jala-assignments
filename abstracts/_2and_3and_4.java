package abstracts;

public class _2and_3and_4 extends _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1 o = new _2and_3and_4();
		// we cannot directly create the abstract class object
		//calling with help of Abstract class object
		o.meth1();
		o.meth2();
		o.meth3();
		// creating thr child class object
		_2and_3and_4 o1 = new _2and_3and_4();
		o1.meth1();// calling the normal method
		// calling the abstract methods
		o1.meth2();
		o1.meth3();

	}

	@Override
	void meth2() {
		// TODO Auto-generated method stub
		System.out.println("abstract method 1 called");
	}

	@Override
	void meth3() {
		// TODO Auto-generated method stub
		System.out.println("abstract method 2 called");
		
	}

}
