package Overloading;

public class Addition 
{
	public void add()
	{
		int x=10;
		int y=20;
		int z=x+y;
		
			System.out.println(z);
		}
		public void add(int x,int y)
		{
			int z=x+y;
			System.out.println("Addition of 2 no is"+z);
		}
	}


