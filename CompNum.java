package javaplaylist;

import java.util.ArrayList;

public class CompNum {
	public static void main(String[] args) {
		int arr[] = {6, 6, 3};
		int secMax = getSecMax(arr);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<secMax) {
				al.add(arr[i]);
			}
		}
		int[] A = new int[al.size()];
		for(int i=0; i<A.length; i++) {
			A[i] = al.get(i);
		}
		for(int i=0; i<A.length; i++) {
			System.out.println(A[i]);
		}
		//System.out.println(secMax);
	}
	public static int getSecMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int maxsec = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				maxsec = max;
				max = arr[i];
			}
			else if(arr[i]>maxsec) {
				maxsec = arr[i];
			}
		}
		return maxsec;
	}
}
