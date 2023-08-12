package javaplaylist;

public class mergeSortedArray {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {5, 6, 7, 8};
		int[] arr3 = new int[8];
		//mergeArray(arr1, arr2, arr1.length, arr2.length, arr3);	
		mergeArrayRecur(arr1, arr2, arr1.length, arr2.length, 0, 0, 0, arr3);
	}
	public static void mergeArray(int[] arr1, int[] arr2, int a, int b, int[] arr3) {
		int i = 0, j = 0, k = 0;
		  while (i < a && j < b) {
		    if (arr1[i] < arr2[j])
		      arr3[k++] = arr1[i++];
		    else
		      arr3[k++] = arr2[j++];
		  }
		  while (i < a) {
		    arr3[k++] = arr1[i++];
		  }
		  while (j < b) {
		    arr3[k++] = arr2[j++];
		}
		for(int z = 0; z<k; z++) {
			System.out.println(arr3[z]);
		}
	}
	public static void mergeArrayRecur(int[] arr1, int[] arr2, int a, int b, int i, int j, int k, int[] arr3) {
		if(k>=arr3.length) {
			for(int z = 0; z<k; z++) {
				System.out.println(arr3[z]);
			}
		}
		if(i<a && j<b) {
			if(arr1[i]<arr2[j]) {
				arr3[k++] = arr1[i++];
			}
			else {
				arr3[k++] = arr2[j++];
			}
			mergeArrayRecur(arr1, arr2, a, b, i, j, k, arr3);
		}
		if(i<a) {
			arr3[k++] = arr1[i++]; 
			mergeArrayRecur(arr1, arr2, a, b, i, j, k, arr3);
		}
		else {
			arr3[k++] = arr2[j++];
			mergeArrayRecur(arr1, arr2, a, b, i, j, k, arr3);
		}
	}	
}