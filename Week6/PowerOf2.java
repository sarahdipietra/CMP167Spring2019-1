/*
 * File: PowerOf2.java
 * Author: Adrian Kuka
 * Date: 3.7.19
 * Description: Find every power of 2 until the exponent that you entered
 */
import java.util.Scanner;
public class PowerOf2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter exponent for 2: ");
		double n = scnr.nextInt();
		double exponentProd = 1;
		
		for(int i = 0; i <= n ; i++) {
			exponentProd = Math.pow(2.0, i);
			System.out.println(exponentProd);
		}
	}
}