package javaplaylist;

public class MergeSortedLLHeap {
	class Pair implements Comparable<Pair> {
	    int num;
	    ListNode head;
	    Pair(int val, ListNode nd) {
	        num = val;
	        head = nd;
	    }
	    public int compareTo(Pair p1) {
	        return Integer.compare(this.num, p1.num);  // Corrected compareTo implementation
	    }
	}
	public class Solution {
	    public ListNode mergeKLists(ArrayList<ListNode> a) {
	        PriorityQueue<Pair> pQueue = new PriorityQueue<Pair>();
	        for (int i = 0; i < a.size(); i++) {
	            if (a.get(i) != null) {  // Check if the list is not empty
	                Pair pr = new Pair(a.get(i).val, a.get(i));
	                pQueue.add(pr);
	            }
	        }
	        ListNode rethead = null;
	        ListNode tail = null;  // To keep track of the tail of the merged list
	        while (!pQueue.isEmpty()) {
	            Pair min = pQueue.poll();
	            if (min.head.next != null) {
	                pQueue.add(new Pair(min.head.next.val, min.head.next));
	            }
	            if (rethead == null) {
	                rethead = min.head;
	                tail = min.head;
	            } else {
	                tail.next = min.head;
	                tail = tail.next;
	            }
	        }
	        return rethead;
	    }
	}
}
