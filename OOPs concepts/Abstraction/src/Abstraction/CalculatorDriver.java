package Abstraction;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator c1 = new CalculatorImp();
		System.out.println(c1.addition(1, 1));
		System.out.println(c1.subtraction(6,9));
		System.out.println(c1.multiplication(6,9));
		System.out.println(c1.division(10,8));
		System.out.println(c1.modulas(189,9));
	}
}
