/*
 * Area.java
 * Adrian
 * 3/12/19
 * This program will calculate area
 */
import java.util.Scanner;

public class Area {
	static Scanner keyboard = new Scanner(System.in);
	/*
	 * rectArea : void
	 * inputs: width and length
	 * process: area = width * length
	 * output: area
	 */
	public static void rectArea() {
		
		int width, length, area;
		System.out.println("Let's calculate area");
		//input
		System.out.println("Enter your width: ");
		width = keyboard.nextInt();
		System.out.print("Enter length: ");
		length = keyboard.nextInt();
		//process and calculation
		area = width * length;
		//output
		System.out.println("The area is: " + area);
		
	}
	//This program is for calculating circle area
	/*
	 * circArea : void
	 * input: radius
	 * process: area = pi * radius^2.0
	 * output: area
	 */
	public static void circArea() {
		
		double radius, area;
		//input
		System.out.println("Enter the radius of your circle: ");
		radius = keyboard.nextDouble();
		//process or calculation
		area = Math.PI * Math.pow(radius, 2.0);
		//output
		System.out.println("Your circle's area is: " + area);
	}
	//This program is for calculating triangle area
	/*
	 * triArea : void
	 * inputs: height and base
	 * process: area = (height*base) / 2.0
	 * output: area
	 */
	public static void triArea() {
		
		double height, base, area;
		//inputs
		System.out.println("Enter the height of the triangle: ");
		height = keyboard.nextDouble();
		System.out.println("Enter the base of the triangle: ");
		base = keyboard.nextDouble();
		//process or calculation
		area = (height * base) / 2.0;
		//output
		System.out.println("The area of the triangle is: " + area);
		
	}
	
	//for debugging
	public static void main(String[] args) {
		rectArea(); //Function call/invocation
		circArea();
		triArea();
		
		
	}
}