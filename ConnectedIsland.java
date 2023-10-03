package javaplaylist;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int u;
	int v;
	Pair(int i, int j){
		u = i;
		v = j;
	}
}

public class ConnectedIsland {
	public static void main(String[] args) {
		int[][] island = {{0,1,1,0},
						 {0,1,1,0},
						 {0,0,1,0},
						 {0,0,0,0},
						 {1,1,0,1}};
		boolean[][] visited = new boolean[island.length][island[0].length];
		Queue<Pair> q = new LinkedList<>();
		int[] row = {0, 1, 0, -1};
		int[] col = {-1, 0, 1, 0};
		int cnt = 0;
		for(int i=0; i<island.length; i++) {
			for(int j=0; j<island[0].length; j++) {
				if(!visited[i][j] && island[i][j]==1) {
					cnt++;
					bfs(island, visited, i, j);
				}
			}
		}
		System.out.println(cnt);
		
	}
	public static void bfs(int[][] island, boolean[][] visited, int i, int j) {
		visited[i][j] = true;
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(i, j));
		while(!q.isEmpty()) {
			Pair p = q.peek();
			int row = p.u;
			int col = p.v;
			for(int delrow = -1; delrow<=1; delrow++) {
				for(int delcol = -1; delcol<=1; delcol++) {
					int nrow = delrow + row;
					int ncol = delcol + col;
					if(nrow>=0 && nrow<island.length && ncol>=0 && ncol<island.length && island[nrow][ncol]==1 && visited[nrow][ncol]==false) {
						q.add(new Pair(nrow, ncol));
						visited[nrow][ncol] = true;
					}
				}
			}
		}
		
	}
}
