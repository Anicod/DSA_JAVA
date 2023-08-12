package javaplaylist;

public class PowerBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pow = 6;
		int base = 2;
		System.out.println(powbase(pow, base));
	}
	public static int powbase(int pow, int base) {
		if(pow == 1) {
			return base;
		}
		if(pow%2!=0) {
			return powbase(pow/2, base)*powbase(pow/2, base)*base;
		}
		else {
			return powbase(pow/2, base)*powbase(pow/2, base);
		}
	}
} 
