package Abstraction;

public abstract class Calculator {
	abstract int addition(int a, int b);
	abstract int subtraction(int a, int b);
	abstract int multiplication(int a, int b);
	public double division(double a, double b) {
		return a/b;
	}
	abstract int modulas(int a, int b);
}

