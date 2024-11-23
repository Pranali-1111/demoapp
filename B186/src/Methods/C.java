package Methods;
//Return type without parameter
public class C 
{
	public int sum()
	{
		int a=20;
		int b=40;
		int c=a+b;
		return c;
	}
	public static void main(String[]args)
	{
		C c=new C();
		int x=c.sum();
		System.out.println(x);
	}

}
