package Exception_Handling;

public class Calculator1 {
	
  public static void main(String[] args) {
	  
	  int []arr= {10 ,20, 30, 40, 50};
	  int i;
	  try
	  {
	    System.out.println("try-block-start");
	    for(i=0;i<5;i++);
	  {
		System.out.println(arr[5]);
	  }
	  
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println("Array Index Out Of Bound ");
	  }
	      System.out.println("End of program");
	    }
  
}

	
			
		
