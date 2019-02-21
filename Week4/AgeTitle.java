/*
 * File: AgeTitle.java
 * Author: Adrian Kuka
 * Created: 2.21.19
 * Description: asking the user's age and then classifying their age.
 */

import java.util.Scanner;

public class AgeTitle {
	public static void main (String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int userAge = scnr.nextInt();
		
		if (userAge > 25) 
			{System.out.println("Adult");	}
		
		else if (18 < userAge && userAge < 26)
		{System.out.println("Young adult"); }
		
		else 
		{System.out.println("Teen"); }
	}
}
