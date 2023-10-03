package javaplaylist;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		String str1 = "animesh";
		String str2 = "aniket";
		int[][] dp = new int[str1.length()+1][str2.length()+1];
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
				else {
					if(str1.charAt(i)==str2.charAt(j)) {
						dp[i][j] = 1 + dp[i-1][j-1];
					}
					else {
						int op1 = dp[i][j-1];
						int op2 = dp[i-1][j];
						dp[i][j] = Math.max(op1, op2);
					}
				}
			}
		}
		//return dp[str1.length()][str2.length()];
		System.out.println(dp[str1.length()][str2.length()]);
	}
}
