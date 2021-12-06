package Arrays;
///Write a function to add integer values of an array
public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arradd[]= {10,20,30,4,5,6};
		System.out.println("The sum of interger values is : "+arrayadd(arradd));

	}
	static int arrayadd(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum =sum+arr[i];
		}
		return sum;
		
	}

}
