package javaplaylist;

public class SumRecursion {
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 6};
		int summ = 0;
		System.out.println(sum(arr, arr.length-1));
	}
	public static int sum(int[] arr, int n) {
		 if(n <= 0) {
			 return 0;
		 }
		 else {
			if(arr[n]%2 == 0) {
				return sum(arr, n-1)+ arr[n];
			}
			else {
				return sum(arr, n-1);
			}
		 }
	}
	
}
