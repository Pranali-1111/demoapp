20package Study;
import java.util.Scanner;

public class Test3
{
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int p,int q)
	{
		int r=p-q;
		return r;
	}
	public int mul(int k, int l)
	{
		int m=k*l;
		return m;
	}
	public int div(int e, int f)
	{
		int g=e/f;
		return g;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int x=sc.nextInt();
		System.out.println("Enter second value");
		int y=sc.nextInt();
		
		Test3 t=new Test3();
		int z=t.sum(x, y);
		int s=t.sub(x,y);
		int u=t.mul(x,y);
		int v=t.div(x, y);
		
		System.out.println(z);
		System.out.println(s);
		System.out.println(u);
		System.out.println(v);
	}
		
		
	}
	

