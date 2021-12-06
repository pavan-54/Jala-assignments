package Arrays;
//Write a function to calculate the average value of an array of integers
public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,30,4,5,6};
		System.out.println("The average of interger values is : "+avgarray(arr));

	}
	static int avgarray(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum =sum+arr[i];
		}
		return (sum/arr.length);
		
	}

}
