package Super;

public class S extends P
{
	public void m1()
	{
	super.m1();
	System.out.println("m1-S");
	}
	public void m2()
	{
		m1();
		this.m1();
		super.m1();
	}
	
	}
	


