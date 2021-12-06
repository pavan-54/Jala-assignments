package Arrays;
//Write a method to find number of even number and odd numbers in an array
public class _15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,5,6,6,8,2,4};
		new _15().counter(arr);
	}
	void counter(int arr[]) {
		int evencount = 0;
		int oddcount = 0;
		for(int i:arr) {
			if(i%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("the even count is :"+evencount);
		System.out.println("the odd count is :"+oddcount);
		
	}

}
