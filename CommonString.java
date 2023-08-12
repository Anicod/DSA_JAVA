package javaplaylist;

public class CommonString {
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String prifix = strs[0];
        for(int i = 1; i<prifix.length(); i++) {
        	prifix = pri(prifix, strs[i]);
        }
        return prifix;
        
    }
    public static String pri(String str1, String str2) {
    	String res = "";
    	for(int i = 0, j = 0; i<str1.length() && j<str1.length(); i++, j++) {
    		if(str1.charAt(i)!=str2.charAt(j)) {
    			break;
    		}
    		res = res + str2.charAt(j);
    	}
    	return res;
    }
}
