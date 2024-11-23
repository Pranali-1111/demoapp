package Inheritance;

public class C 
{
	public static void main(String[]args)
	{
		A a=new B();
				
	   a.m1();// m1-B
	   a.m2();// m2-A
	  // a.m3; //compiler error
	   System.out.println(a.a);
	   System.out.println(a.b);
	   //System.out.println(a.c);//compiler error
	   
	   
	   A a1=new A();
	   a1.m1();
	   a1.m2();
	   System.out.println(a1.a);
	   System.out.println(a1.b);
	   
	   
	  B b=new B();
	  b.m1();
	  b.m3();
	  b.m2();
	  System.out.println(b.a);
	  System.out.println(b.c);
	  System.out.println(b.b);
	  
	}

}
