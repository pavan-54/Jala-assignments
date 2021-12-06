package Arrays;
//Write a function to copy an array to another array
import java.util.Scanner;

//Write a function to remove a specific element from an array
public class test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,6};
		int arr[] = arrcpy(arr1);
		for(int i:arr) {
			System.out.println(i);
		}
		
	}
	static int[] arrcpy(int arr1[]) {
		int arr2[] = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		return arr2;
	}

}
