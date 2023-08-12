package javaplaylist;

import java.util.HashMap;
import java.util.HashSet;

public class Contest3 {
	public static void main(String[] args) {
		String[] constr = {"ab", "cd", "ef", "ab", "gh"};
		String[] ban = {"ab", "df", "lm", "qp"};
		HashSet<String> banSet = new HashSet<>();
		HashMap<String, Integer> convmap = new HashMap<>();
		String ans = "";
		for(int i=0; i<ban.length; i++) {
			banSet.add(ban[i]);
		}
		for(int i=0; i<constr.length; i++) {
			if(banSet.contains(constr[i])) {
				continue;
			}
			if(convmap.containsKey(constr[i])) {
				int freq = convmap.get(constr[i]);
				freq = freq+1;
				convmap.put(constr[i], freq);
			}
			else {
				convmap.put(constr[i], 1);
			}
			//update your answer 
			int freqans = ans.equals("") ? 0 : convmap.get(ans);
			int freqword = convmap.get(constr[i]);
			if(freqword>freqans) {
				ans = constr[i];
			}
			else if(freqword==freqans) {
				if(constr[i].compareTo(ans)<0) {
					ans = constr[i];
				}
			}
		}
		System.out.println(ans);
	}
}
