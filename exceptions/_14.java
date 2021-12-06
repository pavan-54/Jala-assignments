package exceptions;

public class _14 {

	public static void main(String[] args) {

		Data d = new Data();
		d.foo();
		try {
			//d.bar();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}

 class Data {

	public void foo() {
		System.out.println("foo");
	}
	
//	public void bar() {
// 		System.out.println("bar");
// 	}
}
