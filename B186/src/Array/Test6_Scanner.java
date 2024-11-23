package Array;
import java.util.Scanner;

public class Test6_Scanner 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: " );
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value for: "+i+ "=>");
			arr[i]=sc.nextInt();
		}
		System.out.println("****Iterate array element using loop****");
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("****Iterate array elements in Reverse order****");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
					
					
					
		}
	}


