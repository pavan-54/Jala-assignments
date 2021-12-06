package interfaces;

public class _4 implements _4interface1,_4interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4 o = new _4();
		o.interface1meth();
		o.interface2meth();
	}



	@Override
	public void interface2meth() {
		// TODO Auto-generated method stub
		System.out.println("interface 2 method is implemented");
		
	}

	@Override
	public void interface1meth() {
		// TODO Auto-generated method stub
		System.out.println("interface 1 method is implemented");
		
	}

}
