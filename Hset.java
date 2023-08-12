package javaplaylist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hset {
	public static void main(String[] args) {
		int arr[] = {10, 2, -2, -20, 10};
        int sum = -10;
        int n = arr.length;
        System.out.println(findSubarraySum(arr, n, sum));
    }
//	public static void sol(int A) {
//		if(A==1){
//            System.out.println(1);
//            return;
//        }
//		//System.out.println(A);
//		int a = A-1;
//		sol(a);
//        System.out.println(a);
//	}
	static int findSubarraySum(int arr[], int n, int sum)
    {
        // HashMap to store number of subarrays
        // starting from index zero having
        // particular value of sum.
        HashMap<Integer, Integer> prevSum = new HashMap<>();
        prevSum.put(0,1);
        int res = 0;
 
        // Sum of elements so far.
        int currSum = 0;
 
        for (int i = 0; i < n; i++) {
 
            // Add current element to sum so far.
            currSum += arr[i];
            //calculate the sum that have to be removed
          //so that we can get the desired sum
            
            int removeSum=currSum-sum;
 
           //get count of occurrences of that sum that
          //have to removed and add it to res value
            if (prevSum.containsKey(removeSum))
                res += prevSum.get(removeSum);
 
            // Add currsum value to count of
            // different values of sum.
            if(prevSum.containsKey(currSum)) {
            	prevSum.put(currSum,prevSum.get(currSum)+1);
            }
            else {
            	prevSum.put(currSum,1);
            }
            //prevSum.put(currSum,prevSum.getOrDefault(currSum,0)+1);
        }
 
        return res;
    }
}
