package javaplaylist;

public class Solution {
    public int solve(int A, int B, int C) {
        long start = Math.min(B, C);
        long end = (Math.max(B, C))*(long)A;
        long lcm = ((long)B*(long)C)/GCD(B, C);
        long mid = 0;
        long ans = -1;
        //return (int)end;
        //System.out.println(end);
        //return 1;
        while(start<=end){
            mid = (start + (end-start)/2);
            long magical = mid/B + mid/C - mid/lcm;
            if(magical<A){
                start = mid+1;
            }
            else if(magical>A){
                end = (mid - 1);
            }
            else{
                ans = mid;
                end = mid-1;
            }
        }
        return (int)(ans%1000000007);

    }
    public static long GCD(int A, int B){
        while(A>0 && B>0){
            if(A>B){
                A = A%B;
            }
            else{
                B = B%A;
            }
        }
        if(A==0){
            return B;
        }
        return A;
    }
}
