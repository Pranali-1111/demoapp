package InvalideBankAccount;

public class Test {

	public void m1(long BankAccount)throws InvalideBankAccountException
	{
		System.out.println("m1-start");
		int count=0;
		while(BankAccount!=0)
		{
			BankAccount=BankAccount/10;
			
			count++;
		}
		System.out.println(count);
		if(count!=12)
		throw new InvalideBankAccountException("Invalid BankAccount Number...");
		System.out.println("m1-end");
		
		}
	
	 public static void main(String[] args) 
	   {
		System.out.println("main-start");
		
		Test t=new Test();
		try
		{
			t.m1(7954321835l);
		}
		catch(InvalideBankAccountException e)
		{
			System.out.println("catch-block => " +e.getMessage());
		}
		   System.out.println("main-end");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
