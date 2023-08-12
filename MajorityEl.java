package javaplaylist;

public class MajorityEl {
public static void main(String[] args) {
	int[] arr = {1000441,1000441,1000994};
	int maejority = arr[0];
	int freq = 0;
	int count = 0;
	for(int i=1; i<arr.length; i++){
		if(freq==0){
			maejority = arr[i];
			freq = 1;
		}
		else if(arr[i]==maejority){
			maejority  = arr[i];
			freq++;
		}
		else{
			freq--;
		}
	}
	System.out.println(maejority);
	//return maejority;
 	for(int i=0; i<arr.length; i++){
 		if(arr[i]==maejority){
 			count++;
 		}
 	}
 	if(count>arr.length/3){
 		System.out.println(1);
 	}
 	else {
 	System.out.println(-1);
 	}
 } 
}
