/*
 * Area.java
 * Adrian
 * 3/14/19
 * This program will calculate area
 */
import java.util.Scanner;

public class Area {
	static Scanner keyboard = new Scanner(System.in);
	
	/*
	 * getRectArea : int
	 * params : width: int, length: int
	 * calculates rectangle area
	 */
	
	public static int getRectArea(int width, int length) {
		
		return width * length;
	}
	
	
	
	
	
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
	
	
	
	
	
	
	/*
	 * getCircArea : double
	 * params : radius: double
	 * calculates circle area
	 */
	
public static double getCircArea(double radius) {
		
		return Math.pow(radius, 2.0) * Math.PI;
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
	
	
	
	
	
	/*
	 * getTriArea : double
	 * params : height: double, base: double
	 * calculates rectangle area
	 */
	
	public static double getTriArea(double height, double base) {
		
		return (height * base) / 2.0;
		
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
		System.out.println("Enter width and length: ");
		int width	= keyboard.nextInt();
		int length 	= keyboard.nextInt();
		int area 	= getRectArea( width, length);
		
		System.out.println("Enter radius: ");
		double radius = keyboard.nextInt();
		double circArea	= getCircArea(radius);
		
		System.out.println("Enter base and height: ");
		double base = keyboard.nextInt();
		double height = keyboard.nextInt();
		double triArea = getTriArea(height, base);
		
		System.out.println("Area: " + area);
		System.out.println("Circle Area: " + circArea);
		System.out.println("Triangle Area: " + triArea);
	}
}