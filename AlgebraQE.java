package zadaci;

import java.util.Scanner;

public class AlgebraQE {

	private double a;
	private double b;
	private double c;
	
	public AlgebraQE(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double getRoot1() {
		double root1 = 0;
		
		if (this.getDiscriminant() < 0) {
			root1 = 0;
		} else {
			root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		}
		return root1;
	}
	
	public double getRoot2() {
		double root2 = 0;
		
		if (this.getDiscriminant() < 0) {
			root2 = 0;
		} else {
			root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		}
		
		return root2;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter values for a, b and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		
		AlgebraQE test = new AlgebraQE(a, b, c);
		
		if (test.getDiscriminant() > 0) {
			System.out.println("Root1 is " + test.getRoot1());
			System.out.println("Root2 is " + test.getRoot2());
		} else if (test.getDiscriminant() == 0) {
			System.out.println("Root1 is " + test.getRoot1());
		} else if (test.getDiscriminant() < 0){
			System.out.println("The equation has no roots.");
		}
	}
}
