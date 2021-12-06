package this_and_super;

public class _2 {
int a =100;
}
class myclass extends _2{
	int a=10;
	public static void main(String[] args) {
		myclass o = new myclass();
		o.mymeth();
	}
	void mymeth() {
		System.out.println("the var is : "+super.a);
	}
}
