package Collection_Framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size= sc.nextInt();
		int numbers[]=new int[size];
		System.out.println("Enter data in array");
		for(int al=0;al<size;al++)
		{
			numbers[al]=sc.nextInt();
		}
		
		List<Integer> al=new ArrayList<>();
		System.out.println("al");
		
		
		
		 Iterator<Integer> itr=al.iterator();
	      while(itr.hasNext())
	      {
	    	  Integer i =itr.next();
		      System.out.println(i);
	      }
		
		
		
		
	}
}
