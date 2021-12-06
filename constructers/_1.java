package constructers;

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1 o = new _1();
		_1 o1 = new _1(10);
		_1 o2 = new _1(10,20);

	}
	_1(){
		System.out.println("this is default argument constucter");
		
	}
	_1(int a){
		System.out.println("this is one argument constucter");
		
	}
	_1(int a,int b){
		System.out.println("this is two argument constucter");
		
	}

}
