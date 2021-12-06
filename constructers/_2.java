package constructers;

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	_2(){
		System.out.println("default constructer of parent class");
	}
	_2(int a){
		System.out.println("argumented constructer of parent class");
	}

}

class myclass extends _2{
	public static void main(String[] args) {
		new myclass();
		new myclass(15);
	}
	
	public myclass() {
		// TODO Auto-generated constructor stub
		super();
	}
	myclass(int a){
		super(a);
	}
	
}
