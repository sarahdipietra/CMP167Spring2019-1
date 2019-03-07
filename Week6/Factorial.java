/*
 * File: Factorial.java
 * Author: Adrian Kuka
 * Date: 3.7.19
 * Description: Find the factorial of the natural numbers.
 */
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter natural number n: ");
		double n = scnr.nextInt();
		double valFac = 1;
		
		for(int i = 1; i <= n ; i++) {
			valFac = valFac * i;
		}
		
		System.out.println(n + " factorial is equal to " + valFac);
		
	}
}