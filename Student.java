package javaplaylist;

public class Student {
	public static int a;
	public static float b;
	public static char c;
	public static String str;
	public static void main(String[] args) { //static method 
		//int arr[] = { 1, 2, };
		//int n = arr.length;
		//int z;
		//System.out.println(z);
		//int z
		//productArray();  // static method  //call function
		//Student std = new Student();
		//Class c1 = std.getClass();
		//System.out.println(c1.getName());
		//std.fun(); non static method // create instance of the class 
		int[] B = {0, 1, 0};
		int A = B.length;
        int[] count = countZero(A,  B);
//        int numsubArr = A*(A+1)/2;
//        long num = numsubArr-count;
        for(int i=0; i<A; i++) {
        	System.out.println(count[i]);
        }
        int total = 0;
        int i = 0;
        int cnt=0;
        int cnt1 = 0;
        if(count[i]==0) {
        	total = 1;
        }
        for(i=1; i<A;  i++) {
        	if(count[i-1]-count[i]==0) {
        		cnt++;
        	}
        	else if(count[i-1]!=count[i]) {
        		total = total+cnt*(cnt+1)/2;
        		cnt=0;
        	}
        }
//        for(int j=1; j<A; j++) {
//        	if(B[j]==0) {
//        		cnt1++;
//        	}
//        	else {
//        		break;
//        	}
//        }
        total = total+cnt*(cnt+1)/2;
        
        System.out.println(total+cnt1);
		
	}

//	public static int[] solve(int[] A, int[][] B) {
//        int[] pfA = countEvenPf(A);
//        int q = B.length;
//        int sum = 0;
//        int[] cntRange = new int[q];
//
//        for(int i=0; i<q; i++){
//            int l = pfA[i][0];
//            int r = pfA[i][1];
//            if(l==0){
//                sum = pfA[r];
//                cntRange[i] = sum;
//            }
//            else{
//                sum = pfA[r] - pfA[l-1];
//                cntRange[i] = sum;
//            }
//        }
//        return cntRange;
//    }
//    public static int[] countEvenPf(int[] A){
//        int n = A.length;
//        int[] pf = new int[n];
//        int i = 0;
//        if(A[i]%2==0){
//            pf[0]=1;
//        }
//            else{
//                pf[0]=0;
//            }
//            for(i=1; i<A.length; i++){
//                if(A[i]%2==0){
//                    pf[i]=pf[i-1]+1;
//                }
//                else{
//                    pf[i] = pf[i-1];
//                }
//            }
//            return pf;
//        }
	public static int[] countZero(int A, int[] B){
        int[] temp = new int[B.length];
        //int count = 0;
        //int sum = 0;
        int i = 0;
        if(i==0) {
        	temp[0] = B[0];
        }
//        int total = 0;
//        if(B[0]==0){
//            total = 1;
//        }
        for(i=1; i<A; i++){
            temp[i] = temp[i-1] + B[i];
//            temp[i] = sum;
//            if(temp[i-1]==sum){
//                count++;
//            }
//            else if(temp[i-1]!=sum){
//                total = total+count*(count+1)/2;
//                count=0;
//            }
        }
        return temp;
       
        }
    }
