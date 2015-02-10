package dev.code;

import java.io.NotActiveException;
import java.math.BigInteger;
import java.text.BreakIterator;

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
		fibArray = new int[n + 1];

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
		// fibArray = new int[n+1];
		if (n <= 1) {
			fib = n;
		} else {
			fib = recursiveFib(n - 1) + recursiveFib(n - 2);
		}
		return fib;
	}

	public static BigInteger ack(BigInteger m, BigInteger n) {

		BigInteger result = BigInteger.ONE;

		if (m.signum() == 0) {
			result = n.add(BigInteger.ONE);
			return result;
		}
		if (m.signum() > 0 && n.signum() == 0) {
			return ack(m.subtract(BigInteger.ONE), BigInteger.ONE);
		}
		return ack(m.subtract(BigInteger.ONE),
				ack(m, n.subtract(BigInteger.ONE)));
	}

	/*
	 * Euclidean algorithm is a way to find the greatest common divisor of two
	 * positive integers, a and b. The process is based on the observation that,
	 * if r is the remainder when a is divided by b, then the common divisors of
	 * a and b are the same as the common divisors of b and r.
	 */
	public static Integer gcd(int a, int b) {
		int result = 0;
		int r = 0, modr = 0;
		r = a % b;

		if (r > 0) {
			modr = r;
			modr = gcd(b, r);
		} else {
			modr = b;
		}
		return modr;
	}
}
