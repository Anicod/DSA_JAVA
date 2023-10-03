package javaplaylist;

public class DFSGraph {
	public class Solution {
	    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	    public int solve(int[] A, final int B, final int C) {
	        ArrayList<Integer>[] graph=new ArrayList[A.length+1];
	        for(int j=0;j<=A.length;j++){
	            graph[j]=new ArrayList<Integer>();
	        }
	        for(int i=1;i<A.length;i++){
	            int u=A[i];
	            int v=i+1;
	            graph[u].add(v);
	            // System.out.println(graph[u]);
	        }
	       
	        boolean visited[]=new boolean[A.length+1];
	        for(int i=0;i<visited.length;i++){
	            visited[i]=false;
	        }
	        dfs(graph,C,visited);
	        if(visited[B]==false){
	            return 0;
	        }
	        return 1;
	    }
	    public void dfs(ArrayList<Integer> graph[],int s,boolean[] visited){
	        visited[s]=true;
	        for(int v:graph[s]){
	            if(visited[v]==false){
	                dfs(graph,v,visited);
	            }
	        }    
	    }
	}
}
