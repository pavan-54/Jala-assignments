package Operaters;

public class _3and_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		fun(a, b);
		b=10;
		fun(a,b);
		
	}
	static void fun(int a,int b) {
		if(a==b) {
			System.out.println("They are equal!");
		}
		if(a!=b) {
			System.out.println("They are not equal");
		}
	}

}
