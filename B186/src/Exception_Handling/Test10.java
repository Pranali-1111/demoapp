package Exception_Handling;

public class Test10 {

	public int m1()
	{
		int x=10;
		try
		{
	  System.out.println("try-Block");
		return x;
		}
		finally
		{
		   x=40;
		   System.out.println("finally-Block--"+x);
		   return x;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Test10 t=new Test10();
		
		int a=t.m1();
		System.out.println(a);
	}
}
			
			

	
