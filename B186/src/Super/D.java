package Super;

public class D extends C
{
	public D()
	{
		this(4);
		System.out.println("constructor-D");
	}
	public D(int i)
	{
		this("pranali");
		System.out.println("constructor-int");
	}
    public D(String s)
    {
    	System.out.println("constructor-D-string");
    }
}
