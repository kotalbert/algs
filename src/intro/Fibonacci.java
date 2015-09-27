package intro;

//import utils.*;

public class Fibonacci {

	static final int MAX_N = 100;

	public static long F(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return F(N - 1) + F(N - 2);
	}

	public static void main(String[] args) {

		long f_array[] = new long[MAX_N];

		for (int N = 0; N < MAX_N; N++) {
			f_array[N] = F(N);
//			Utils.prntln(N + " " + F(N));
		}

	}
}