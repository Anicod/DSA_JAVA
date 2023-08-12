package javaplaylist;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "animesh";
		int i = 0;
		reverse(str, 0, str.length()-1);
	}
	public static void reverse(String str, int i, int len) {
		if(len<i) {
			System.out.println("reversed"+str);
			return;
		}
		else {
			swp(str, i, len);
			i++;
			len--;
			reverse(str, i, len );
		}
	}
	public static void swp(String str, int a, int b) {
		str.charAt(b);
	}

}
