package javaplaylist;

import java.util.PriorityQueue;

public class PrinseAlgo {
	class Pair implements Comparable<Pair> {
	    int vertex;
	    int wt;
	    Pair(int v, int w){
	        vertex = v;
	        wt = w;
	    }
	    public int compareTo(Pair p1) {
		        return Integer.compare(this.wt, p1.wt);
		    }
	}
	public class Solution {
	    public int solve(int A, int[][] B) {
	        ArrayList<Pair>[] al = new ArrayList[A+1];
	        for (int i = 0; i < A+1; i++) {
	            al[i] = new ArrayList<Pair>();
	        }
	        for(int i=0; i<B.length; i++){
	            int u = B[i][0];
	            int v = B[i][1];
	            int w = B[i][2];
	            al[u].add(new Pair(v, w));
	            al[v].add(new Pair(u, w));
	        }
	        boolean[] visited = new boolean[A+1];
	        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
	        visited[1] = true;
	        int ans = 0;
//	        ArrayList<Pair> lst = al[1];
//	        Pair p2 = lst.get(0);
//	        ans = p2.wt;
//	        for(Pair p : al[1]){
//	            pq.add(new Pair(p.vertex, p.wt));
//	        }
	        pq.add(new Pair(1, 0));
	        while(!pq.isEmpty()){
	            Pair p = pq.poll();
	            int v = p.vertex;
	            int w = p.wt;
	            if(!visited[v]){
	                ans = ans + w;
	                visited[v] = true;
	                for(Pair p1 : al[v]){
	                	if(!visited[p1.vertex])
	                    pq.add(new Pair(p1.vertx, p1.wt));
	                }
	            }
	        }
	        return ans;
	    }
	}

}
