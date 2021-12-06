package basics;

public class _5 {

	int a=10;//this is global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_5 b = new _5();// creating a object
		int a=20;//this is a local variable with respect to the main function
		System.out.println(a);//   20   
		//the default priority is given to the local variable
		System.out.println(b.a);//10
		// with the help of object reference we are calling the global variable
		
		

	}

}
