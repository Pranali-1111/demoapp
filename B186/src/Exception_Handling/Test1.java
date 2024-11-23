package Exception_Handling;

public class Test1 {
public static void main(String[] args) 
{
	System.out.println("main-start");
	try
	{
		int x=10/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch-Block-");
	}
	    System.out.println("main-w");
}
}
