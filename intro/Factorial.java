package intro;
import utils.*;

public class Factorial {

	static long factorial(int n) {
		
		if (n!=1) return n*factorial(n-1);
		else return 1;
	}
	
	static double log_fact(int n) {
		
		if (n!=1) return Math.log(n)+log_fact(n-1);
		else return 0;
		
		
	}
	
	public static void main(String[] args) {

		Utils.prntln(log_fact(20));

	}

}
