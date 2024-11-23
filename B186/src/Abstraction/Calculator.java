package Abstraction;

public class Calculator implements Calculation
{
  public void add()
{
	int x=10;
	int y=20;
	int z=x+y;
	 
	System.out.println(z);
}
  public void sub()
  {
	  int a=40;
	  int b=10;
	  int c= a-b;
	  
	  System.out.println(c);
  }
  public void mul()
  {
	  int d=25;
	  int e=4;
	  int f=d*e;
	  
	  System.out.println(f);
	  
  }
  public void div()
  {
	  int m=60;
	  int n=30;
	  int p=m/n;
	  
	  System.out.println(p);
	  
  }
  }

