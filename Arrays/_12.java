package Arrays;
//Write a method to remove duplicate elements from an array
public class _12{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,5,6,6,8,2,4};
		System.out.println("original array");
		for(int i:arr) {
				System.out.println(i);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
		}
		System.out.println("After removing duplicates!!!");
		for(int i:arr) {
			if(i!=0) {
				System.out.println(i);
			}
		}
		
		}

	}