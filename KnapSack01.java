package javaplaylist;

public class KnapSack01 {
	public static void main(String[] args) {
		int A = 7;
		int[] wt = {3, 6, 5, 2, 4};
		int[] val = {12, 20, 15, 6, 10};
		int[][] dp = new int[wt.length][A+1];
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		int include = 0;
		int exclude = 0;
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
				else {
					exclude = dp[i-1][j];
					if(j-wt[i-1]>=0) {
						include = dp[i-1][j-wt[i-1]] + val[i-1];
					}
				}
				dp[i][j] = Math.max(exclude, include);
			}
		}
		System.out.println(Integer.MAX_VALUE-1000000000);
		
}
	}
