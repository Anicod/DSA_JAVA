package javaplaylist;

public class CountMinPerfectSquare {
	public static int ans;
	public static void main(String[] args) {
		int[] dp = new int[51];
		for(int i=0; i<dp.length; i++) {
			dp[i] = -1;
		}
	       int n = count(50, dp);
	       System.out.println(n);
	       ans = Integer.MAX_VALUE;
	}
	public static int count(int n, int[] dp) {
		if(n==0 || n==1) {
			return n;
		}
		if(n<0) {
			return 0;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		ans = Integer.MAX_VALUE;
		for(int i=1; i<=Math.sqrt(n); i++) {
			ans = Math.min(ans, count(n-i*i, dp));
		}
		dp[n] = ans+1;
		return ans+1;
	}
}

}
