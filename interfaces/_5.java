package interfaces;

public class _5 implements _5interface1,_5interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _5().meth();

	}
	/*
	 * no need of overriding this method 2 times
	 * because they bore same signature
	 */
	@Override
	public void meth() {
		// TODO Auto-generated method stub
		System.out.println("same method called");
	}

}
