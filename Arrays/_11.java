package Arrays;
//Write a program to find the common values between two arrays
public class _11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,6,7,11};
		int arr1[]= {5,3,6,7,8,1,6};
		int bigsize = arr.length>=arr1.length?arr.length:arr1.length;
		int commonval[] = new int[bigsize];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				int flag=0;
				if(arr[i]==arr1[j]) {
					for(int k=0;k<commonval.length;k++) {
						if(commonval[k]!=arr[i]) {
							flag=1;
						}
					}
					if(flag==1)
					commonval[i]=arr[i];
				}
			}
		}
		for(int i:commonval) {
			if(i!=0)
			System.out.println(i);
		}
		
		}

	}

