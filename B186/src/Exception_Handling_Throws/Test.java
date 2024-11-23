package Exception_Handling_Throws;

public class Test {

	public void m1()
	{
		System.out.println("m1-start");
		int x=10/0;
		System.out.println("m1-end");
	}
	public static void main(String[] args) {
		
		System.out.println("main-");
		Test t=new Test();
		try
		{
			t.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch-block");
		}
		System.out.println("main-end");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
