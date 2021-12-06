package method_overloading;

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4 o = new _4();
		o.meth(10, 20);
		o.meth("Pavan", 'c');

	}
	 void meth(int a,int b){
	     System.out.println("this is method 1 with one parameter of different type");
	     }
	 void meth(String a,char c){
	     System.out.println("this is method 2 with two parameter of differnet type");
	 }

}
