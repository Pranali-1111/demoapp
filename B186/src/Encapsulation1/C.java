package Encapsulation1;

import Encapsulation.A;

public class C extends A
{
	A a=new A();
	
	public void m2()
	{
		//System.out.println(a.x);
		System.out.println(x);
		
		C c=new C();
		System.out.println(c.x);
	}

}
