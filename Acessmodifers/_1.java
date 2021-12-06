package Acessmodifers;

public class _1 {
	private int a=10;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name="Pavan";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1 o = new _1();
		System.out.println("the id is "+o.a);
		System.out.println("The name is "+o.name);
		o.mymeth();
	}
	private void mymeth() {
		System.out.println("This is the private method");
	}
	

}
class subclass extends _1{
	//subclass obj = new subclass();
	public static void main(String[] args) {
		new subclass().meth();
	}
	void meth() {
	_1 obj = new _1();
	System.out.println("the id is "+obj.getA());
	System.out.println("The name is "+obj.getName());
	/*
	 * there is no direct way to acces the priavte method of parent class
	 * we need use the refelection api
	 */
	//obj.mymeth();
	}
	
}
