package Inheritence;

public class myclass extends ClassC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC c = new myclass();
		ClassB b = new myclass();
		ClassA a = new myclass();
		a.orverriddenmeth();
		a.nma1();
		a.nma2();
		b.orverriddenmeth();
		b.nmb1();
		b.nmb2();
		c.orverriddenmeth();
		c.nmc1();
		c.nmc2();
		new myclass().mymeth();
	}
	 void mymeth() {
		 System.out.println("-------------");
		ClassA o = new ClassB();
		System.out.println("over riding method of class B with refernce to super class");
		o.orverriddenmeth();//overriding method of class B
		ClassA oo = new ClassC();
		System.out.println("over riding method of class C with refernce to super class");
		oo.orverriddenmeth();//over riding method of class C with refernce to super class
	 }


}
