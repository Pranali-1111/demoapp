package Exception_Handling;

public class Test4 {

public static void main(String[] args) {
	
	System.out.println("Main-Start");
	
	try
	{
		System.out.println("try-start");
		int x=10/0;
		System.out.println("try-end");
	}
	catch(ArithmeticException e )
	{
		System.out.println("catch-block");
	}
	System.out.println("Main-End");
}	

}
	
	
	
	
	
	
	
	
	
	
	
	

