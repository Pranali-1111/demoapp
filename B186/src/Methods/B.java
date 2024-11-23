package Methods;
//Parameterized method
public class B
{
	public void add(int x,int y)
	{
		int z=x+y;
		
		System.out.println("Addition of 2 no is"+z);
	}
	public static void main(String []args)
	{
		B b=new B();
		b.add(5,2);
		
	}

}
