package Exception_Handling;

public class Test12 {

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
			
      System.out.println("finally-Block");
		}
		
		
	}
	
	public static void main(String[] args) {
		 
		Test12 t=new Test12();
		
		  int a=t.m1();
		  System.out.println(a);
	}
}
			

	

