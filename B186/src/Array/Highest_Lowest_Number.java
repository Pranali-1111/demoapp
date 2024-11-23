package Array;

public class Highest_Lowest_Number 
{
	public static void main(String[] args)
	{
		int num[]= {1,5,7,12,3,9,15,20,14,10};
		
		int high=num[0];
		int low=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			int num1=num[i];
			
			if(num1>high)
			{
				high=num1;
			}
			else if(num1<low)
			{
				low=num1;
			}
		}
		System.out.println("Highest number is"+high);
		System.out.println("Lowest number is"+low);
		
	}

}
