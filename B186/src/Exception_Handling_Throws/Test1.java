package Exception_Handling_Throws;

public class Test1 {

	public void m1(int age)throws AgeInvalideException
	{
		System.out.println("m1-start");
		if(age<0)
			
	    throw new AgeInvalideException("age problem");
		
		System.out.println("m1-end");
	}
	    public static void main(String[] args) {
	    	
		System.out.println("main-start");
		
		Test1 t=new Test1();
		try
		{
			t.m1(5);
	}
		catch(AgeInvalideException e)
		{
			System.out.println("catch-block => "+e.getMessage());
		}
		    System.out.println("main-end");
	    }
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

