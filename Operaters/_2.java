package Operaters;

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2 o = new _2();
		o.op(5);

	}
	void op(int a) {
		System.out.println("The ++ (post incremernt)  is "+(a++));//5 
		System.out.println("The ++ (pre incremernt)  is "+(++a));//7   (6+1)
		System.out.println("The -- (post decrement)  is "+(a--));//7 
		System.out.println("The -- (pre decrement)  is "+(--a));//5  (6-1)
		
	}

}
