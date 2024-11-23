package Static;

public class B
{
	static int x;
	       int y;
	       
	       public static void main(String[]args)
	       {
	    	 B b=new B();
	    	  
	    	 b.x=50;
	    	 b.y=50;
	    	 
	    	 B b1=new B();
	    	 b1.x=100;
	    	 b1.y=100;
	    	 
	    	 B b2=new B();
	    	 System.out.println(b.x);
	    	 System.out.println(b.y);
	    	 System.out.println(b1.x);
	    	 System.out.println(b1.y);
	    	 System.out.println(b2.x);
	    	 System.out.println(b2.y);
	       }

}
