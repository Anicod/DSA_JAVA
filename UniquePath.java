package javaplaylist;

public class UniquePath {
	public class Solution {
	    public static int cnt;
	    public int solve(int[][] A) {
	        cnt = 1;
	        int sti = 0;
	        int stj = 0;
	        // if(A.length==2){
	        //     return 0;
	        // }
	        for(int i=0; i<A.length; i++){
	            for(int j=0; j<A[i].length; j++){
	                if(A[i][j]==1){
	                    sti = i;
	                    stj = j; 
	                    break;
	                }
	            }
	        }
	        int eni = 0;
	        int enj = 0;
	        for(int i=0; i<A.length; i++){
	            for(int j=0; j<A[i].length; j++){
	                if(A[i][j]==2){
	                    eni = i;
	                    enj = j;
	                    break;
	                }
	            }
	        }
	            int cntzero = 0;
	            for(int i=0; i<A.length; i++){
	            for(int j=0; j<A[i].length; j++){
	                if(A[i][j]==0){
	                   cntzero++; 
	                }
	            }
	        }
	        boolean[][] visited = new boolean[A.length][A[0].length];
	        boolean bool = check(A, sti, stj, eni, enj, visited, cntzero);
	        return cnt;
	    }

	    public static boolean check(int[][] A, int sti, int stj, int eni, int enj, boolean[][] visited, int cntzero){

	        if(sti==eni && stj == enj){
	            if(cntzero==0){
	                cnt++;
	            }
	            return true;
	        }
	        if(sti<0 || stj<0 || sti>=A.length || stj>=A[0].length || A[sti][stj]==-1 || visited[sti][stj]){
	            return false;
	        }
	        visited[sti][stj] = true;
	        boolean up = check(A, sti-1, stj, eni, enj, visited, cntzero-1);
	        boolean down = check(A, sti+1, stj, eni, enj, visited, cntzero-1);
	        boolean left = check(A, sti, stj-1, eni, enj, visited, cntzero-1);
	        boolean right = check(A, sti, stj+1, eni, enj, visited, cntzero-1);
	        visited[sti][stj] = false;
	        return up || down || left || right;
	    }
	}

}
