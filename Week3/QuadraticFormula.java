/*
 * file		: QuadraticFormula.java
 * author	: Adrian Kuka
 * created	: 2/14/19
 * desc		: This program implements quadratic formula 
 */
import java.util.Scanner;

public class QuadraticFormula {

	private static Scanner scnr;

	public static void main(String[] args) 
	
	{
		System.out.println("\t\tWelcome to Quadratic 3000");
		System.out.println("This program implements quadratic formula.");
		
		scnr = new Scanner(System.in);
		double root1;
		double root2;
		double a;
		double b;
		double c;
		
		System.out.println("Choose value of a: ");
		a = scnr.nextDouble();
		
		System.out.println("Choose value of b: ");
		b = scnr.nextDouble();
		
		System.out.println("Choose value of c: ");
		c = scnr.nextDouble();
		
		double discrimValue = (Math.sqrt((Math.pow( b, 2.0 ) - (4.0 * a * c))));
		
		root1 = (-b + discrimValue) / 2;
		root2 = (-b - discrimValue) / 2;
		
		System.out.println("Your roots are: " + root1 + " and " + root2 + ".");

	}

}
