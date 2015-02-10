package dev.code;

import java.beans.beancontext.BeanContext;
import java.math.BigInteger;

import javax.swing.plaf.multi.MultiButtonUI;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 0;
		double x2 = 0, y1 = 0, y2 = 0;
		double distance = 0;
		double factor, fact = 0;
		int fib;

		MathUtils mu = new MathUtils();

		x2 = 9;
		x1 = 3;
		y2 = 7;
		y1 = 2;

		distance = mu.getDistance(x2, x1, y2, y1);
		System.out.println("Distance is: " + distance);

		factor = 5;
		fact = mu.factorial(factor);
		System.out.println("Factorial of " + factor + " is: " + fact);

		fib = mu.fib(40);
		fib = mu.recursiveFib(40);
		System.out.println("Recursive Fib is: " + fib);

		BigInteger m = BigInteger.valueOf(3);
		BigInteger n = BigInteger.valueOf(4);

		// BigInteger ack = mu.ack(m, n);
		// System.out.println("Ackerman value of " + m + " " + n + " is: " +
		// ack);

		// System.out.println(mu.gcd(36, 20));

		// int a = 210, b = 45;
		int a = 1, b = 3;
		a = 289833;
		b = 33;
		int gcd = mu.gcd(a, b);
		System.out.println("Show GCD of " + a + " " + b + " is: " + gcd);

		int coltz = mu.collatz(93434, true);
		
		// check if prime
		boolean isPrime;
		for (int i = 1; i < 1000; i++) {
			isPrime = mu.checkIfPrime(i);
			if (isPrime) {
				System.out.println(i + " is prime ");
			}
		}
		int p = 981;
		isPrime = mu.checkIfPrime(p);
		System.out.println(p + " is prime " + isPrime);
		
		double factx = mu.myexp(5);
		System.out.println("factx is: " + factx);
		

	}
}
