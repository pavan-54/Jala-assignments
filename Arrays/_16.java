package Arrays;
//Write a function to get the difference of largest and smallest value
public class _16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,5,6,7,8,2,4};
		System.out.println("The differnce between largest and smallest is : "+diffcal(arr));

	}
	static int diffcal(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return (arr[arr.length-1]-arr[0]);
		
	}

}
