package Study;

import java.util.Scanner;

public class Calculation1 
{
	public static void main(String [] args)
	{

	Calculation1 c=new Calculation1();
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Addition/n2 2.Subtraction/n3 3.Multiplication/n4 4.Division/n5");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		
	System.out.println("enter 1st number");
	int a=sc.nextInt();
	System.out.println("Enter 2nd number");
	int b=sc.nextInt();
	int add=c.add(a,b);
	System.out.println("result:"+add);
	break;
	case 2:
		
		System.out.println("enter 1st number");
		long p=sc.nextLong();
		System.out.println("enter 2nd number ");
		long q=sc.nextLong();
		long sub=c.sub(p,q);
		System.out.println("result:"+sub);
		break;
	case 3:
		
		System.out.println("enter 1st number");
		double m=sc.nextDouble();
		System.out.println("enter 2nd number");
		double n=sc.nextDouble();
		double mul=c.mul(m,n);
		System.out.println("result:"+mul);
		break;
	case 4:

		System.out.println("enter 1st number");
		float x=sc.nextFloat();
		System.out.println("enter 2nd number");
		float y=sc.nextFloat();
		float div=c.div(x,y);
		System.out.println("result: "+div);
		break;
		default:
			System.out.println("invalid choice");
	}
}
		
		
		
	
	
			

}
