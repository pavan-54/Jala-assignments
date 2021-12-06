package Arrays;
//Write a function to remove a specific element from an array
import java.util.Scanner;

public class _5 {

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
				arr[i]=0;
			}
		}
		if(flag!=1) {
			System.out.println("The element is not found in the array");
		}
		for(int i:arr) {
			if(i!=0)
			System.out.println(i);
		}

	}

}
