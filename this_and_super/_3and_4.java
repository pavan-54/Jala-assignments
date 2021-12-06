package this_and_super;

public class _3and_4{
	//this();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _3and_4(10);//direclty calls constructer
		

	}
	_3and_4(int a){
		this("Pavan");//calling paremterised constructer
		System.out.println("this class constucter called");
	}
	_3and_4(String name){
		this();
		System.out.println("the name is "+name);
	}
	_3and_4(){
		System.out.println("this is called by this keyword");
	}

}
