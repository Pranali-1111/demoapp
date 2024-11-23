package Array;

public class Test2 
{
  public static void main(String[] args) 
  {
	  int[]arr= {23,56,34,20,45,57,90,12,49,100};
	  int min=arr[0];
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println(arr[i]);
		  
		  int num=arr[i];
		  
		  if(num<min)
		  {
			  if(num<min)
			  {
				  min=num;
				  
			  }
			  System.out.println(min);
		  }
	  }
	  
	
}
}
