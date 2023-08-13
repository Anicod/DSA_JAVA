package javaplaylist;

import java.util.Stack;

public class AdvContest3 {
	public static void main(String[] args) {
		Stack<Character> st = Stack<>();
		String str = "[[][[[]]";
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=='[') {
				st.push(str.charAt(i));
				
			}
			else {
				if(st.isEmpty()) {
					st.push('[');
					cnt++;
				}
				else {
					st.pop();
				}
			}
			if(st.empty()) {
				print(cnt);
			}
			if(st.size()%2==0) {
				cnt+st.size()/2
			}
			print(-1);;
		}
	}
	//Awsome tree;
	Queue<Node> qu =  new LinkedList<>();
	qu.add(root);
	while(!qu.isEmpty()) {
		boolean ismpty = false;
		int n = qu.size();
		for(int i=0; i<n; i++) {
			Node nd = qu.poll();
			if(ismpty && nd.left!=null || nd.right!=null) {
				Print(0) //return 0;
			}
			if(nd.left!=null) {
				qu.add(nd.left);
			}
			else {
				ismpty = true;
			}
			if(ismty && nd.right!=null) {
				return 0;
			}
			if(nd.right!=null) {
				qu.add(nd.right)
			}
			else {
				ismpty = true;
			}
		}
	}
	
	
}
