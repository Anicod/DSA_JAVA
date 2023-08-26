package javaplaylist;

public class LeetContest2 {
	public static void main(String[] args) {
		int[] arr = {12, 1, 1};
		int fst = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		if(arr[0]>arr[1]) {
			fst = arr[0];
			sec = arr[1];
		}
		else {
			fst = arr[1];
			sec = arr[0];
		}
		for(int i=2; i<arr.length; i++) {
			if(arr[i]>fst) {
				sec = fst;
				fst = arr[i];
			}
			else if(arr[i]>sec && fst!=arr[i]) {
				sec = arr[i];
			}
		}
		System.out.println(fst+sec); 
	}
}
