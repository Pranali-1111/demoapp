package Array;

public class Duplicate_Number
{
   public static void main(String[] args) 
	{
		int arr[]= {3,4,6,2,3,5,4,7,5,2};
		
		System.out.println("duplicate values are:");
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]==arr[j])&&(i!=j))
				{
					System.out.println(arr[j]+" ");
				}
		}
		
		}
	}
}
	

