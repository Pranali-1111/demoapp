package Overloading;

public class Division 
{
	public void div()
	{
		int k=15;
		int l=3;
		int m=k/l;
		
		System.out.println(m);
	}
	public void div(int x,int y)
	{
		int z=x/y;
		System.out.println("Division is 2 no:"+z);
	}

}
