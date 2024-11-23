package ArrayPractice;

import java.util.Scanner;

public class EmpTest {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		EmpI ei=new EmployeeDetails();
		while(true)
		{
			System.out.println("1.save Emp \n2.get all Emp  \n3.searchEmp \n4.exit");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				ei.setEmp();
				break;
				
			case 2:
				ei.getAllEmp();
				break;
				
			case 3:
				ei.searchEmp();
				break;
				
			case 4:
				System.exit(0);
				break;
				
				default :
					System.out.println("Invalid Choice");
					break;
			}
		}
	}

}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

