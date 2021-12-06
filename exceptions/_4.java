package exceptions;

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string =null;
		
		try {
			int l = string.length();
			int a =100/0;
		} 
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("null is there");
		}
		catch (ArithmeticException e1) {
			// TODO: handle exception
			System.out.println("we cant divide by zero");
		}


	}

}
