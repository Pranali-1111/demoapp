package Exception_Handling;

public class Test7 {
	public static void main(String[] args) 
	{
		System.out.println("main-start");
		try
		{
			System.out.println("try-start");
			int x=10/0;
			System.out.println("try-end");
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch-block");
		}
		finally
		{
			System.out.println("finally-block");
		}
		System.out.println("program-end");
	}

}
