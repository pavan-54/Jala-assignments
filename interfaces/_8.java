package interfaces;

public class _8 implements _8interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The interface filed value is : "+a);
		_8 o = new _8();
		String myname =o.getname();
		System.out.println("the name is : "+myname);
		o.meth();

	}

	@Override
	public void meth() {
		// TODO Auto-generated method stub
		System.out.println("this is the interfrace method");
		
		
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

}
