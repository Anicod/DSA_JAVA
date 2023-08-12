package javaplaylist;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {2, 3, 5, 8, 9};
		int target = 10;
		System.out.println(binSearch(arr, 0, (0+arr.length-1)/2, arr.length-1, target));
	}
	public static int binSearch(int[] arr, int first, int mid, int last, int target) {
		if(mid >= arr.length/2) {
		  System.out.println("not found");
		  return -1;
		}
		if(arr[mid] == target) {
			return mid;
		}
		if(arr[mid]>target) {
			return binSearch(arr, first, (first+mid-1)/2, mid-1, target);
		}
		else {
			return binSearch(arr, mid+1, (mid+1+last)/2, last, target);
		}
	}

}
