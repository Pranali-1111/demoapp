package Array;

public class Descending_Numbers 
{
	public static void main(String[] args) 
	{
		int[]arr= {15,5,20,12,10};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[j+1])
				{
					   temp=arr[j];
					   arr[i]=arr[i+1];
					   arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]+" ");
		}
		
	}

}
