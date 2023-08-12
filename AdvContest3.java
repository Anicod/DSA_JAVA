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
	
}
