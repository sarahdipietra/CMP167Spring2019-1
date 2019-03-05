/*
 /* File: Loops.java
 * Author: Adrian Kuka
 * Date: 3.5.19
 * Description: A program that calculates the sum of the first n natural numbers where the n is given by the user.
 */
import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		
		int naturalNum;
		int totalSum = 0;
		int counter = 0;
		
		System.out.println("Enter the value of naturalNum: ");
		
		naturalNum = scnr.nextInt();
		
		while (counter < naturalNum) {
			counter++;
			totalSum += counter;
			
		}
				
		System.out.println("The sum is: " + totalSum);
	}
}