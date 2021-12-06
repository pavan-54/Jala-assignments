package exceptions;

public class _6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new myexception(20);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
class myexception extends Exception{
	int a;
	public myexception(int b) {
		// TODO Auto-generated constructor stub
		a=b;
	}
	public String toString(){
		return("exception number=")+a;
	}
}
