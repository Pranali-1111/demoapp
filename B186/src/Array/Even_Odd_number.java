package Array;

public class Even_Odd_number 
{
	public static void main(String[] args) 
	{
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even number"+arr[i]);
			}
			else
			{
				System.out.println("odd number"+arr[i]);
			}
		}
		
	}

}
