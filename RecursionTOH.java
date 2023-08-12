package javaplaylist;

public class RecursionTOH {
	public class Solution {
	    public static int i;
	    public int[][] towerOfHanoi(int A) {
	        int num = (int)Math.pow(2, A);
	        int[][] arr = new int[num-1][3];
	        i = 0;
	        toh(1, 3, 2, arr, A);
	        return arr;

	    }
	    public static void toh(int a, int c, int b, int[][] arr,  int A){
	        if(A == 0){
	            return;
	        }
	        toh(a, b, c, arr, A-1);
	        arr[i][0] = A;
	        arr[i][1] = a;
	        arr[i++][2] = c;
	         
	        toh(b, c, a, arr, A-1);
	        
	    }
	}
}
