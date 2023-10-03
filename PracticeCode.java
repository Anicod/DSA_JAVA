package javaplaylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeCode {
	public static int ans;
	public static void main(String[] args) {
		int[] arr = {2, -1, -4, 5, 3, -1, 4, 2};
		int n = arr.length-1;
		int num = getsumSubsequence(arr, n);
		int[] dp = new int[]
	}
	public static int getsumSubsequence(int[] arr, int n) {
		if(n==0) {
			return arr[n];
		}
		if(n<0) {
			return 0;
		}
		int sa1 = arr[n] + getsumSubsequence(arr, n-2);
		int sa2 = getsumSubsequence(arr, n-1);
		return Math.max(sa1, sa2);
	}
}
