package Operaters;

public class _7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {24,20,3,40,50};
		int small=arr[0];
		int larg=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(small<arr[i]) {
				small=arr[i];
			}
			else {
				larg=arr[i];
			}
		}
		System.out.println("The largest is : "+larg);
		System.out.println("The smallest is : "+small);
		
		}
}
