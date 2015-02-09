package dev.code;

/** 
 * @author md
 *
 */
public class MathUtils {

	 
	public static double getDistance(double x2, double x1, double y2, double y1) {
		double distance = 0;

		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		return distance;
	}
	
	public static double factorial(double n) {
		double recursive = 0, result = 0;
		System.out.println("Starting... " + n + " " + recursive);
		if (n == 0) {
			result = 1;
		} else {
			recursive = factorial(n - 1);
			result = n * recursive;
			// return n*factorial(n-1);
			System.out.println("n " + n + " recursive " + recursive
					+ " result " + result);
		}
		return result;
	}
	
	// calculate Fibonacci sequence
		public static int fib(int n) {
			int fib = 0;
			int i, start = 0;
			int seed = 0;
			int[] fibArray;
			fibArray = new int[n+1];

			for (int j = 0; j <= n; j++) {
				if (j <= 1) {
					fibArray[j] = j;
				} else {
					fibArray[j] = fibArray[j - 1] + fibArray[j - 2];
				}
			}
			for (int j = 0; j <= n; j++) {
				fib = fibArray[j];
				if (j == n) {
					System.out.println("Fib is: " + fib);
				}
			}
			return fib;
		}

		public static int recursiveFib(int n) {
			int fib = 0;
			int i, start = 0;
			int seed = 0;
			int[] fibArray;
			//fibArray = new int[n+1];
			if (n <= 1) {
				fib = n;
			} else
			{
				fib = recursiveFib(n-1) + recursiveFib(n-2);
			}
			return fib;
		}	
}
