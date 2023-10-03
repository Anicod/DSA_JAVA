package javaplaylist;

public class BipertiteGraph {
	 public int solve(int A, int[][] B) {
	        ArrayList<Integer>[] al = new ArrayList[A];
	                for (int i = 0; i < A; i++) {
	                al[i] = new ArrayList<Integer>();
	        }
	        for(int i=0; i<B.length; i++){
	            int u = B[i][0];
	            int v = B[i][1];
	            al[u].add(v);
	            al[v].add(u);
	        }
	        Queue<Integer> queue = new LinkedList<>();
	        //boolean[] visited = new boolean[A]
	        //visited[0] = true;
	        int[] colour = new int[A];
	        for(int i=0; i<colour.length; i++){
	            colour[i] = -1;
	        }
	        int count = 0;
	        for(int i=0; i<A; i++){
	            if(colour[i]!=-1){
	                continue;
	            }
	            colour[i] = 0;
	              queue.add(i);
	              while(!queue.isEmpty()){
	            int curr = queue.poll();
	            for(int v : al[curr]){
	                if(colour[v]==-1){
	                    colour[v] = 1-colour[curr];
	                    queue.add(v);
	                }
	                if(colour[v]==colour[curr]){
	                    return 0;
	                }
	            }
	        }
	    }
	        return 1;
	    }
	}
}
