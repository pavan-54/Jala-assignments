package Arrays;
//Write a function to reverse an array of integer values
public class _9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,2,3,4,2,6,1,8};
		int newarr[]=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;j<arr.length;i--) {
			newarr[j]=arr[i];
			j++;
		}
		for(int i:newarr) {
			System.out.println(i);
		}
	}

}
