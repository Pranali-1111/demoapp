package Static;

public class C 
{
	static int x=20;
	       int y=10;
	       
	       public void m1()
	       {
	    	   System.out.println(x);
	    	   System.out.println(y);
	    	   System.out.println(C.x);
	    	   //System.out.println(c.y);
	    
	    	   C c=new C();
	    	   System.out.println(c.x);
	    	   System.out.println(c.y);
	       }
	       public static void m3()
	       {
	    	   System.out.println(x);
	    	  // System.out.println(y);
	    	   System.out.println(C.x);
	    	   //system.out.println(c.y);
	    	   
	       }
	       public static void main(String[] args) 
	       {
			
	           C c =new C();
	    	   System.out.println(c.x);
	    	   System.out.println(c.y);
	    	   
	       }
	            

}
