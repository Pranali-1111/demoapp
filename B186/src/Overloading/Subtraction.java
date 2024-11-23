package Overloading;

public class Subtraction 
{
	public void sub()
	{
		int a=40;
		int b=20;
		int c=a-b;
		
		System.out.println(c);
	}
	public void sub(int x,int y)
	{
		int z=x-y;
		System.out.println("Subtraction of 2 no:"+z);
	}

}
