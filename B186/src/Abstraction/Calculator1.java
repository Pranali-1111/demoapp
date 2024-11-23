package Abstraction;

public class Calculator1 implements Calculation1
{
	public void add(int x,int y)
	{
		int z=x+y;
		
		System.out.println("Addition of 2 no is:"+z);
	}
   public void sub(long a,long b)
   {
	   long c=a-b;
	   
	   System.out.println("subtraction of 2 no is:"+c);
   }
   public void mul(double m,double n)
   {
	   double p=m*n;
	   
	   System.out.println("Multiplication of 2 no is"+p);
   }
   public void div(float d,float e)
   {
	   float f=d/e;
	   
	   System.out.println("Division of 2 no is"+f);
   }
   
	   
   
}
