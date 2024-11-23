package Exception_Handling;

public class Test5 {
	
public static void main(String[] args) {
	
	System.out.println("Main-start");
	try
	{
		String s=args[0];
		int x=Integer.parseInt(s);
		int a=10/x;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("plz Enter input value");
	}
	catch(NumberFormatException e)
	{
		System.out.println("Enter Number only");
	}
	catch(ArithmeticException e)
	{
		System.out.println("plz enter non zero value");
	}
	System.out.println("main-end");
}
}
