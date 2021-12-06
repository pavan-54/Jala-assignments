package Arrays;
//Write a method to verify if the array contains two specified elements(12,23)
public class _17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,12,6,7,8,2,23};
		System.out.println(isthere12and23(arr));
	}
	static boolean isthere12and23(int arr[]) {
		int _12flag=0;
		int _23flag=0;
		
		for(int i:arr) {
			
			if (i==12){
				_12flag=1;
			}
			if(i==23) {
				_23flag=1;
			}
		}
		if(_12flag==1 && _23flag==1)
		return true;
		else return false;
		
	}

}
