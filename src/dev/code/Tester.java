package dev.code;
 
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
	}
}
