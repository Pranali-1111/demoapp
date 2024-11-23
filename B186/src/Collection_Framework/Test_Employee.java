package Collection_Framework;

import java.util.Scanner;

public class Test_Employee {

	public static void main(String[] args)
	{
		
		
	
		//ed.createEmp();
		//ed.showEmp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Empdetails");
		EmpDetails ed = new EmpDetails();
		
		while(true)
		{
			System.out.println("1.crateEmp\n2.showEmp\n3.exit");
			int ch=sc.nextInt();
		

	switch (ch)
	{
		case 1:
			ed.createEmp();
			break;
		case 2:
			ed.showEmp();
			break;
		case 3:
			System.exit(0);
			break;
			
			default:
				System.out.println("Invalid Choice");
				break;
	}
	}
				
	}
}


	
	
		

