package method_overloading;

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    _2 m = new _2();
     m.meth(10);
     m.meth("Pavan",'c');   
 }
 void meth(int a){
     System.out.println("this is method 1 with one parameter of different type");
     }
 void meth(String a,char c){
     System.out.println("this is method 2 with two parameter of differnet type");
 }
}
