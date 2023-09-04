package javaplaylist;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AdvContest4 {
	//Alice and Pizza Problem
 public static void main(String[] args) {
	int[] A = {1, 4, 5, 9, 10};
	int B = 8;
	int cnt = 0;
	Arrays.sort(A);
	for(int i=0; i<A.length; i++) {
		if(B>=A[i]) {
			cnt++;
		}
		B = B-A[i];
	}
 //Min Wood Cost Problem
	int[] B = {1, 4, 5, 9, 10};
 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
 for(int i=0; i<pq.size(); i++) {
	 pq.add(B[i]);
 	}
 int sum = 0;
  while(pq.size()>1) {
	  int a = pq.poll() + pq.poll();
	  sum = sum + a;
	  pq.add(a);
  }
 }
}
