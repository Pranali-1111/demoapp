package Polymorphism;

public class A2 
{
	public void m1(A a)
	{
		System.out.println("m1-A");
	}
	public void m1(Object o)
	{
		System.out.println("m1-Object");
	}
	public void m1(String s)
	{
	  System.out.println("m1-String");
	}
	public static void main(String[] args) 
	{
		A2 a=new A2();
//		a.m1(null);//Ambiguous error
		a.m1((Object)null);
		a.m1((String)null);
		a.m1((A)null);
		
		
	}
		
	}


