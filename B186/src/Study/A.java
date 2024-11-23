package Study;

public class A
{
	public boolean numbercheck(int n)
	{
		if(n%2==0)
			return true;
		else
			return false;
	}
	public static void main(String[]args)
	{
		A a=new A();
		
		boolean result=a.numbercheck(40);
		System.out.println(result);
	}

}
