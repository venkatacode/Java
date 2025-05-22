package array;

public class Matrix {
	public static void main(String args[]) {
		//sum of diagonal numbers
//		int[][] arr = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i][i];
//		}
//		System.out.println(sum);
		//Missing Number
		int arr[]= {1,2,3,4,5,7};
		for(int i=0;i<=arr.length;i++) {
			if(i<arr.length-1) {
			int diff=arr[i+1]-arr[i];
			if(diff!=1) {
				System.out.println(arr[i+1]-1);
			}
			}
		}
	}
}
