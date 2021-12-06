package Static;
//Print instance variables in static methods
//Print static variables in Instance methods
//Call instance methods in static methods
//Call static methods in instance methods
public class static_exaple {
	static int a=10;
	int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth1();
		static_exaple obj = new static_exaple();
		obj.meth();//calling instance method from static method
		// printing all variables from main method
		System.out.println(a);
		System.out.println(new static_exaple().b);

	}
	static void meth1() {
		System.out.println("static method called");
		System.out.println("Instance varibale from static method is "+ new static_exaple().b);
		//new static_exaple().meth();//calling instance method from static method
	}
	 void meth() {
		 System.out.println("instacne method called");
		System.out.println(" static varibale from Instance  method is "+ a);
		meth1();//calling static method from instance method
	}

}
