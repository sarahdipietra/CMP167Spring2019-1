/*
 * File: Average.java
 * Author: Adrian Kuka
 * Date: 3.7.19
 * Description: Find the averages of the natural numbers.
 */
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter natural number n: ");
		double n = scnr.nextInt();
		double numSum = 0;
		double avgNum = 0;
		
		
		for(int i = 1; i <= n ; i++)
			{
			numSum = numSum + i;
			}
		avgNum = numSum / n;
		System.out.println("The average of all natural numbers added until " + n + " is: " + avgNum);
	}
}