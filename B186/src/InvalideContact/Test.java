package InvalideContact;

public class Test {

	public void m1(long contact)throws InvalideContactException
	{
		System.out.println("m1-start");
		int count=0;
		while(contact!=0)
		{
			contact = contact/10;
			count++;
		}
		System.out.println(count);
		if(count!=10)
	    throw new InvalideContactException("Invalid Contact ....");
		System.out.println("m1-end");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main-start");
		
		Test t=new Test();
		try
		{
			t.m1(7954321897l);
		}
		catch(InvalideContactException e)
		{
			System.out.println("catch-block => " +e.getMessage());
		}
		   System.out.println("main-end");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
