package Scanner;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		User u=new User();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		u.id=sc.nextInt();
		System.out.println("Enter Mobile no");
		long umob=sc.nextLong();
		u.mobno=umob;
		
		System.out.println("Enter name");
		u.name=sc.next()+sc.nextLine();
		System.out.println("Enter Address");
		u.address=sc.next()+sc.nextLine();
		System.out.println("Enter gender");
		u.gender=sc.next().charAt(0);
		System.out.println("Enter weight");
		u.weight=sc.nextFloat();
		System.out.println("Enter boolean info");
		u.info=sc.nextBoolean();
		
		System.out.println(u.id);
		System.out.println(u.mobno);
		System.out.println(u.name);
		System.out.println(u.address);
		System.out.println(u.gender);
		System.out.println(u.weight);
		System.out.println(u.info);
		
	}

}
