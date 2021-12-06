package Arrays;
//Write a function to find the minimum and maximum value of an array
public class _8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,2,3,4,2,6,1,8};
		int small=arr[0];
		int larg=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(small>arr[i]) {
				small=arr[i];
			}
			if(larg<arr[i]) {
				larg=arr[i];
			}
		}
		System.out.println("The largest element :"+larg);
		System.out.println("The smallest element : "+small);
		

	}

}
