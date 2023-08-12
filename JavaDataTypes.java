package javaplaylist;

public class JavaDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 5, 4, 7};
		fun(arr);
	}
	public static void fun(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 1; j<arr.length-1-i; j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					 
					
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
