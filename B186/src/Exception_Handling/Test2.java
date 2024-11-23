package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
	
public static void main(String[] args) 
{

	Scanner sc=new Scanner(System.in);

	try {
		System.out.println("Enter the number:");
		int input=sc.nextInt();
		int result=input/0;
	}
	catch(InputMismatchException e)
	{
		System.out.println("please enter the valid number");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Divide by zero ..... "  +e.getMessage());
	}
	System.out.println("end");
}
}

