package javaplaylist;

import java.util.Arrays;
import java.util.Collections;

public class ChangeChar {
 public static void main(String[] args) {
//	 String A = "abcabbccd";
//	 int B = 3;
//	 int[] arr = new int[26];
//     //int[] arra = new int[26];
//     for(int i=0; i<A.length(); i++){
//         arr[A.charAt(i)-'a']++;
//     }
//     //Collections.sort(arr, Collections.reverseOrder());
//     Arrays.sort(arr);
//     //Arrays.sort(arr);
//     int count = 0;
//     for(int i=arr.length-1; i>=0; i--){
//         if(B>=arr[i]){
//             B = B-arr[i];
//             count = count+1;
//         }
//         else{
//             break;
//         }
//     }
//     //return count;
//     System.out.println(count);
	 int A = 8;
	 int B = 0;
	 int a = 0;
     String str = "";
     String check = ischeck(A, B, a, str);
     System.out.println(check);
 }
 public static String ischeck(int A, int B, int a, String str){
     if(a>=A){
         return "01";
     }
     str = str+ischeck(A, B, a+1, str);
     return str;
 }
}
