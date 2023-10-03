package javaplaylist;

public class BFSGraph {
	public class Solution {
	    public int solve(int A, int[][] B) {
	        ArrayList<Integer>[] al = new ArrayList[A+1];
	          for (int i = 0; i < A+1; i++) {
	            al[i] = new ArrayList<Integer>();
	        }
	        Queue<Integer> queue = new LinkedList<>();
	        //int[][] mat = new int[A+1][A+1];
	        for(int i=0; i<B.length; i++){
	            int u = B[i][0];
	            int v = B[i][1];
	            al[u].add(v);
	           // al[v].add(u);
	        }
	        boolean[] visited = new boolean[A+1];
	        queue.add(1);
	        visited[1] = true;
	        while(!queue.isEmpty()){
	            int curr = queue.poll();
	            ArrayList<Integer> nebr = al[curr];
	            for(int i=0; i<nebr.size(); i++){
	                if(visited[nebr.get(i)]==false){
	                    queue.add(nebr.get(i));
	                    visited[nebr.get(i)] = true;
	                }
	            }
	        }
	        if(visited[A]){
	            return 1;
	        }
	        return 0;
	    }
	}

}
