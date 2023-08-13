package javaplaylist;

public class TrieDsa {
	class TreeNodeTr {
	     int val;
	     TreeNodeTr[] children = new TreeNodeTr[26];
	     int isend = 0;
	    TreeNodeTr(int x) {
	      val = x;
	      isend = 0;
	     }
	     TreeNodeTr() {
	     }
	  }
	public class Solution {
	    public ArrayList<Integer> solve(ArrayList<String> A, ArrayList<String> B) {
	        TreeNodeTr root = new TreeNodeTr();
	        ArrayList<Integer> retAr = new ArrayList<>();
	        for(int i=0; i<A.size(); i++){
	            String str = A.get(i);
	            insertN(str, root);
	        }
	        for(int i=0; i<B.size(); i++){
	            String str = B.get(i);
	            retAr.add(isSearch(root, str));

	        }
	        return retAr;

	    }
	    public static void insertN(String A, TreeNodeTr root){
	        int n = A.length();
	        TreeNodeTr curr = root;
	        for(int i=0; i<n; i++){
	            char ch = A.charAt(i);
	            int idx = ch-'a';
	            if(curr.children[idx]==null){
	                TreeNodeTr nn = new TreeNodeTr(idx);
	                curr.children[idx] = nn;
	            }
	            curr = curr.children[idx];
	        }
	        curr.isend = 1;
	    }
	    public static int isSearch(TreeNodeTr root, String A){
	        TreeNodeTr curr = root;
	        int n = A.length();
	        for(int i=0; i<n; i++){
	            char ch = A.charAt(i);
	            int idx = ch-'a';
	            if(curr.children[idx]==null){
	                return 0;
	            }
	            curr = curr.children[idx];

	        }
	        return curr.isend;
	    }
	}

}
