package javaplaylist;

public class WordBreak {
	public class Solution {
	    public int wordBreak(String A, String[] B) {
	        HashSet<String> set=new HashSet();
	        for(int i=0; i<B.length; i++){
	            set.add(B[i]);
	        }
	        int[] dp = new int[A.length()];
	        for(int i=0; i<dp.length; i++){
	            dp[i] = -1;
	        }
	        return wordBr(A, set, dp, 0);
	    }
	    public static int wordBr(String A, HashSet<String> set, int[] dp, int j){
	        //System.out.println(A);
	        if(A.length()==0){
	            return 1;
	        }
	        if(dp[j]!=-1){
	            return dp[j];
	        }
	        for(int i=0; i<=A.length(); i++){
	            String prif = A.substring(0, i);
	            if(set.contains(prif)){
	                int sa = wordBr(A.substring(i), set, dp, j+i);  //j+i because for intializing j==0 again and again hence j+i is the correct way
	                if(sa==1){
	                    dp[j] = 1;
	                    return 1;
	                }
	               
	            }
	        }
	        dp[j] = 0;
	        return 0;
	    }
	}

}
