package Array;
import java.util.Scanner;
public class Test5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			
		System.out.println("Even value for:"+i+"=>");
		arr[i]=sc.nextInt();
		}
		System.out.println("Even numbers in Array are:");
		for(int i=0;i<size;i++)
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" ");
			}
		System.out.println("odd numbers in Array are:");
		for(int i=0;i<size;i++)
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]+" ");
			}
			
	}

}
