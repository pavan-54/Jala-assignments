package Arrays;

import java.util.Scanner;

//Write a function to test if array contains a specific value
public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,4,5,6};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element: ");
		int n= sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("The element is found in the array");
		}
		else {
			System.out.println("The element is not found in the array");
		}

	}

}
