package javaplaylist;

public class Pallandrome {
	public static void main(String[] args) {
		String name = "radar";
		int i = 0;
		palland(name, name.length(), i);
	}
	public static void palland(String name, int len, int i) {
		if(len<=0) {
			System.out.println("pallandrome");
			return;
		}
		if(name.charAt(i) == name.charAt(len-1)) {
			palland(name, len-1, i+1);
		}
		else {
			System.out.println("not pallandrome");
		}
	}
}
