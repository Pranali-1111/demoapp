package Super;

public class D1 extends C1 
{
	int x=20;
	
	public void m1()
	{
		int x=30;
		System.out.println(x);//30
		System.out.println(this.x);//20
		System.out.println(super.x);//10
	}

}
