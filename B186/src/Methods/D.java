package Methods;
//Return type with parameter
public class D 
{
	public int add(int a,int b,int c)
	{
		int z=a+b+c;
		return z;
	}
	public static void main(String []args)
	{
		D d=new D();
		int add=d.add(20, 30,40);
		
		System.out.println(add);
		
	}

}
