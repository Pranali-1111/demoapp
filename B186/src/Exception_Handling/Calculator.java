package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	Scanner sc = new Scanner(System.in);
	
	public void div()
	{
		try 
		{
			System.out.println("Enter 1st no: ");
			int a = sc.nextInt();
			
			System.out.println("Enter 2nd no: ");
			int b = sc.nextInt();
			
			System.out.println("Division is : " +(a/b));
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Enter non zero no for division .....");
		}
		
		catch (InputMismatchException e) 
		{
			System.out.println("Enter number only ........");
		}
		
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.div();
	}
}
