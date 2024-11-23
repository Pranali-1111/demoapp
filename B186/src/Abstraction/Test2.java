   
package Abstraction;
import java.util.Scanner;
public class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Calculation1 c1=new Calculator1();
		
				
		System.out.println("Enter first Number");
        int x=sc.nextInt();
        System.out.println("Enter Second Number");
        int y=sc.nextInt();
        c1.add(x,y);
        
	
        System.out.println("Enter first Number");
        long a=sc.nextInt();
        System.out.println("Enter Second Number");
        long b=sc.nextInt();
        c1.sub(a,b);
        
	 
        
        System.out.println("Enter first Number");
        double m=sc.nextInt();
        System.out.println("Enter Second Number");
        double n=sc.nextInt();
        c1.mul(m,n);
        
        
        System.out.println("Enter first Number");
        float d=sc.nextInt();
        System.out.println("Enter Second Number");
        float e=sc.nextInt();
        c1.div(d,e);
        
        
}
	
}