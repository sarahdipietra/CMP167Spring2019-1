/*
 * author: Adrian Kuka
 * created: 2/7/19
 * Desc: Calculating the average of three numbers.
 */

package hi;
import java.util.Scanner;
public class AverageOfThreeNumbers {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		double number1;
		double number2;
		double number3;
		
		System.out.println("Enter Number 1: ");
		number1 = scnr.nextDouble();
		System.out.println("Enter Number 2: ");
		number2 = scnr.nextDouble();
		System.out.println("Enter Number 3: ");
		number3 = scnr.nextDouble();
		
		double average = (number1 + number2 + number3) / 3;
		System.out.println("The average is: " + average);
		
		
		
	}

}
