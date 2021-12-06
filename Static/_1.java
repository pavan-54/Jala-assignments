package Static;
//Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
//methods and a main method.
public class _1 {
	static int var=12;//static variable 1
	static int var2=25;//static avriable 2
	String name= "Pavan"; // instance variable 1
	char init='a'; // insatnce variable 2
	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub
		meth1();//calling a static method directly 
		meth2();// no need of object reference
		_1 obj = new _1();
		obj.meth3();// calling a non static method with help of object
		obj.meth4();
	
	}
	static void meth1() { //static method 1
		System.out.println("inside static method 1");
	}
	static void meth2() {//static method 2
		System.out.println("inside static method 2");
	}
	void meth3() {//instance method 1
		System.out.println("inside instance method 1");
	}
	void meth4() {//instance method 2
		System.out.println("inside instance method 2");
	}

}
