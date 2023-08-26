package javaplaylist;

public class FlattenTree {
	/**
	 * Definition for binary tree
	 * class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	 class Pair {
	     TreeNode head;
	     TreeNode tail;
	     Pair(TreeNode h, TreeNode t){
	         head = h;
	         tail = t;
	     }
	 }
	public class Solution {
		public TreeNode flatten(TreeNode a) {
	        Pair flat = flatn(a);
	        TreeNode temp = a;
	        while(temp!=null){
	            if(temp.left!=null){
	                temp.left = null;
	                //System.out.println("flag");
	            }
	            temp = temp.right;
	            
	        }
	        return a;
		}
	    public static Pair flatn(TreeNode root){
	        if(root==null){
	            return new Pair(null, null);
	        }
	        Pair l = flatn(root.left);
	        Pair r = flatn(root.right);
	        if(l.head == null && r.head==null){
	            return new Pair(root, root);
	        }
	        if(l.head == null){
	            root.right = r.head;
	            return new Pair(root, r.tail);
	        }
	        if(r.head==null){
	            root.right = l.head;
	            return new Pair(root, l.tail);
	        }
	        root.left = null;
	        root.right = l.head;
	        l.tail.right = r.head;
	        return new Pair(root, r.tail);
	    }
	}

}
