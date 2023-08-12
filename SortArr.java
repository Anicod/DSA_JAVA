package javaplaylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortArr {
	public static void main(String args[]) {
//		ArrayList<Integer> A = new ArrayList();
//		A.add(36);
//		A.add(13);
//		A.add(26);
//		A.add(37);
//		A.add(28);
//		A.add(27);
//		A.add(43);
//		System.out.println(A);
//        Collections.sort(A, new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2) {
////                String str1 = o1.toString() + o2.toString();
////                String str2 = o2.toString() + o1.toString();
////
////                Long num1 = Long.parseLong(str1);
////                Long num2 = Long.parseLong(str2);
//            	Integer num1 = countFact(o1);
//            	Integer num2 = countFact(o2);
//            	if(num1>num2) {
//            		return num1.compareTo(num2);
//            	}
//            	else {
//            		if(num1==num2) {
//            			return o1.compareTo(o2);
//            		}
//            	}
//            	return -1;
//
//            }
//        });
//        System.out.println(A);
	int[] A = {17, 4, 12};
//		int[] pf = pfSum(arr);
//		for(int i=0; i<pf.length; i++) {
//			System.out.println(pf[i]);
//		}
		System.out.println(solve(A));
	}

//	public static Integer countFact(Integer o1) {
//		// TODO Auto-generated method stub
//		Integer count = 0;
//		Integer cnt = 0;
//		for(int i=1; i<=Math.sqrt(o1); i++) {
//			if(o1%i==0) {
//				cnt++;
//				if(o1%i==i) {
//					count = count+1;
//				}
//				else {
//					count = count+2;
//				}
//			}
//		}
//		if(cnt==1) {
//			return cnt;
//		}
//		return count;
//	}
//	public static int[] pfSum(int[] arr) {
//		int[] pf = new int[arr.length];
//		if(arr[arr.length-1]==0) {
//			pf[arr.length-1] = 0;
//		}
//		else {
//			pf[arr.length-1] = 1;
//		}
//		for(int i=arr.length-2; i>=0; i--) {
//			if(arr[i]==1) {
//				pf[i] = pf[i+1]+arr[i];
//			}
//			if(arr[i]==0) {
//				pf[i] = 0;
//			}
//		}
//		return pf;
//	}
//	public static int solve(int[] A) {
//        int sum = 0;
//        int cnt = 0;
////        int left = 0;
////        int right = 0;
//        int n = A.length;
////        if(A[0]>A[1]) {
////        	left = 1;
////        }
//        for(int j=1; j<=n-2; j++){
//            int left = 0;
//            for(int i=0; i<j; i++){
//                if(A[i]<A[j]){
//                    left++;
//                }
//            }
//            int right = 0;
//            for(int k=j+1; k<n; k++){
//                if(A[k]>A[j]){
//                    right++;
//                }
//
//            }
//            //cnt = left*right;
//            sum = sum + left*right;
//        }
//        return sum;
//    }
	public static int solve(int[] A) {
        //Arrays.sort(A);
        //ArrayList<Integer> al = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < A.length; i++)   
        {  
        for (int j = i + 1; j < A.length; j++)   
        {  
        int tmp = 0;  
        if (A[i] > A[j])   
        {  
        	count++;
        }  
        }  

//        int[] arr = new int[al.size()];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = al.get(i);
//        }
        //return arr;
        return count;
    }
}
