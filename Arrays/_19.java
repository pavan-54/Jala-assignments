package Arrays;
//. Write a function to find the missing number of sorted array of 1 to 100
public class _19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[100];
		for(int i=0;i<100;i++) {
			if(i==53) // setting 23 as missing for easy case
				continue;
			arr[i]=i;
		}
		System.out.println("missing number is: "+missingnumber(arr));
		

	}
	static int missingnumber(int arr[]) {
		int val=0;
		for(int i=0;i<100;i++) {
			if(i!=arr[i]) {
				val=i;
				break;
			}
		}
		return val;
		
	}

}
