package javaplaylist;

public class DijkatraAlgo {
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
	    public int[] solve(int A, int[][] B, int C) {
	        ArrayList<Pair>[] al = new ArrayList[A];
	        for (int i = 0; i < A; i++) {
	            al[i] = new ArrayList<Pair>();
	        }
	        for(int i=0; i<B.length; i++){
	            int u = B[i][0];
	            int v = B[i][1];
	            int w = B[i][2];
	            al[u].add(new Pair(v, w));
	            al[v].add(new Pair(u, w));
	        }
	        int[] dist = new int[A];
	        for(int i=0; i<dist.length; i++){
	            if(i!=C){
	                dist[i] = Integer.MAX_VALUE;
	            }
	        }
	        boolean[] visited = new boolean[A];
	        visited[C] = true;
	        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
	        for(Pair p : al[C]){
	            dist[p.vertex] = p.wt;
	            pq.add(new Pair(p.vertex, p.wt));
	        }
	        while(!pq.isEmpty()){
	            Pair p = pq.poll();
	            int v = p.vertex;
	            int w = p.wt;
	            // if(visited[v]){
	            //     continue;
	            // }
	            visited[v] = true;
	            //int sum = 0;
	            for(Pair pr : al[v]){
	                 int currdist = dist[v] + pr.wt;
	                if(currdist<dist[pr.vertex]){
	                    dist[pr.vertex] = currdist;
	                    pq.add(new Pair(pr.vertex, pr.wt));
	                }
	            }
	        }
	        for(int i=0; i<dist.length; i++){
	            if(dist[i]==Integer.MAX_VALUE){
	                dist[i] = -1;
	            }
	        }
	        return dist;

	    }

	}

}
