package Overloading;

public class Multiplication 
{
	public void multi()
	{
		int p=30;
		int q=60;
		int r=p*q;
		
		System.out.println(r);
	}
	public void multi(int x,int y)
	{
		int z=x*y;
		System.out.println("Multiplication of 2 no:"+z);
	}

}
