package method_overloading;

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    _1 m = new _1();
     m.meth(10);
     m.meth(10,20);
 
 }
 void meth(int a){
     System.out.println("this is method 1 with one parameter of same type");
     }
 void meth(int a,int b){
     System.out.println("this is method 2 with two parameter of same type");
 }
}

