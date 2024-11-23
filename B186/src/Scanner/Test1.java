package Scanner;

import java.util.Scanner;

public class Test1 
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in); 
	{
		Calculator c=new Calculator();
		System.out.println("Enter value of x");
		c.x=sc.nextInt();
		System.out.println("Enter value of y");
		c.y=sc.nextInt();
		
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
			

}
}
