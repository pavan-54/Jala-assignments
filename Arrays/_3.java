package Arrays;
//Write a program to find the index of an array element
import java.util.Scanner;
public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,4,5,6};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element: ");
		int n= sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				flag=i;
			}
		}
		if(flag!=0) {
			System.out.println("The index of "+n+" is "+flag);
		}
		

	}

}