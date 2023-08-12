package javaplaylist;

public class SortingRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 4, 3};
		recurSort(arr,  0, 0+1);
	}
	public static void recurSort(int[] arr, int i, int j) {
		if(i>=arr.length) {
			for(int k = 0; k<arr.length; k++) {
				System.out.print(arr[k]);
			}
			
			return;
		}
		if(j<arr.length) {
		
		if(arr[i]>arr[j]) {
			swp(arr, i, j);
		}
		j++;
		recurSort(arr, i, j);
		}
		else {
			i = i+1;
			recurSort(arr, i, 0+i);
		}
		
	}
	public static void swp(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
	