package javaplaylist;

public class KrushakAlogo {
	public class Solution {
	    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
	        int[][] arr = new int[B.size()][3];
	        for(int i=0; i<B.size(); i++){
	            ArrayList<Integer> col = B.get(i);
	            for(int j=0; j<col.size(); j++){
	                arr[i][j] = col.get(j);
	            }
	        }
	        int col = 2;
	        sortbyColumn(arr, col);
	        long ans = 0;
	        int[] parent = new int[A+1];
	        for(int i = 1; i<parent.length; i++){
	            parent[i] = i;
	        }
	        for(int i=0; i<arr.length; i++){
	            int u = arr[i][0];
	            int v = arr[i][1];
	            int w = arr[i][2];
	            int rootu = getroot(u, parent);
	            int rootv = getroot(v, parent);
	            if(rootu==rootv){
	                continue;
	            }
	            if(rootu<rootv){
	                parent[rootv] = rootu;
	            }
	            else{
	                parent[rootu] = rootv;
	            }
	            ans = (ans + w)%1000000007;

	        }
	        return (int)ans;

	    }
	        public static void sortbyColumn(int arr[][], int col)
	    {
	        // Using built-in sort function Arrays.sort with lambda expressions
	       
	      Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col])); // increasing order
	         
	    }
	    public static int getroot(int x, int[] parent){
	        if(x == parent[x]){
	            return x;
	        }
	        int ans = getroot(parent[x], parent);
	        return ans;
	    }
	}

}
