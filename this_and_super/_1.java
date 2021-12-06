package this_and_super;

public class _1 {
	int a=10;
	public static void main(String[] args) {
		new _1().mymeth();
	}
	void mymeth() {
		int b=20;
		System.out.println("the values is "+this.a);//10
	}
	

}
