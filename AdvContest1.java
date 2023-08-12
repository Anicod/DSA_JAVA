package javaplaylist;

public class AdvContest1 {
	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int ans = arr[0];
//		int max = Integer.MIN_VALUE;
//		
//		
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i]>arr[i-1]) {
//				ans = ans + arr[i];
//				max = Math.max(ans, max);
//			}
//			else {
//				ans = arr[i];
//			}
//		}
//		System.out.println(ans);
		//maximum distance between two 1's
//		int prev =-1;
//		int curr = -1;
//		int ans = 0;
//		int num = 26;
//		for(int i=31; i>=0; i--) {
//			int bitval = num & (1<<i);
//			if(bitval!=0) {
//				prev = curr;
//				curr = i;
//			}
//			if(prev!=-1) {
//				ans = Math.max(ans, prev-curr);
//				
//			}
//			
//			
//		}
//		return ans;
		int num = 6;
		int bitval = num&(1<<2);
		System.out.println(bitval);
		public int solve(int[] A, int B) {
	        HashMap<Integer, Long> map = new HashMap<>();
	        for(int i=0; i<B; i++){
	            map.put(i, 0L);
	        }
	        for(int i=0; i<A.length; i++){
	            int rem = A[i]%B;
	            if(map.containsKey(rem)){
	                long freq = map.get(rem);
	                freq = freq + 1;
	                map.put(rem, freq);
	            }
	        }
	        long cnt = ((map.get(0))*(map.get(0)-1))/2;
	        //return cnt;
	        int l = 1;
	        int r = B-1;
	        while(l<r){
	            cnt = cnt + (map.get(l)*map.get(r))%1000000007;
	            cnt = cnt%1000000007;
	            l++;
	            r--;
	        }
	        //return cnt;
	        if(l==r){
	            cnt = cnt + (((map.get(l))*(map.get(l)-1))/2)%1000000007;
	            cnt = cnt%1000000007;

	        }
	         return (int)cnt%1000000007;
	    } 
	}
	
}
