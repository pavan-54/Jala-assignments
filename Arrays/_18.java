package Arrays;
//Write a program to remove the duplicate elements and return the new array
public class _18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,5,6,6,8,2,4};
		System.out.println("original array");
		for(int i:arr) {
				System.out.println(i);
		}
		System.out.println("After removing duplicates!!!");
		int arr1[] = removeduplicates(arr);
		for(int i:arr1) {
			System.out.println(i);
		}

		
		
		}
	static int [] removeduplicates(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
		}
		int c=0;
		for(int i:arr) {
			if(i!=0)
				c++;
		}
		int newarr[] = new int[c];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
			newarr[j]=arr[i];
			j++;
			}
		}
		return newarr;
		
	}

}
