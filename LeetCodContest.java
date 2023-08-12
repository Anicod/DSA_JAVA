package javaplaylist;

public class LeetCodContest {
	public static void main(String[] args) {
		//faulty keyboard
		String str = "kbfjbsijdsj";
		//spilit the array
		int[] arr = {1, 2, 3};
		int m = 8;
		splitTheArray(arr);
		String str1 = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='i') {
				rev(str, i+1, str.length());
			}
			else {
				str1 = str1 + str.charAt(i);
			}
		}
	}
	public static void splitTheArray(int[] arr, int m) {
		if(arr.length<=2) {
			print(true);
			return;
		}
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]+arr[i]>=m) {
				print(true);
				return;
			}
		}
		print(false);
	}
	
	
}
