package ArrayPractice;

import java.util.Scanner;

public class EmployeeDetails implements EmpI {

	Employee e;
	int arr[]=new int[5];
	Employee emparr[];
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void setEmp() {
		System.out.println("How many Employee to save: ");
		int empno=sc.nextInt();
		emparr=new Employee[empno];
		for (int i=0;i<emparr.length;i++)
		{
			e=new Employee();
			System.out.println("Enter Emp Id : ");
			e.setEid(sc.nextInt());
			System.out.println("Enter Emp Name : ");
			e.setEname(sc.next());
			System.out.println("Enter Emp Salary :");
			e.setSalary(sc.nextDouble());
			System.out.println("Enter Emp Contact :");
			e.setContact(sc.nextLong());
			emparr[i]=e;
		}
	}
	    @Override
	    public void getAllEmp() {
	    	
	    	for(Employee e : emparr)
	    	{
	    		System.out.println(e.getEid());
	    		System.out.println(e.getEname());
	    		System.out.println(e.getSalary());
	    		System.out.println(e.getContact());
	    	}
	    }


		
	   @Override
	    public void searchEmp()
	    {
		  
		   System.out.println("Enter Empid to search: ");
		   int empno=sc.nextInt();
			
			
			for (int i=0;i<emparr.length;i++)
			{
				if(e.getEid()==empno)
				{
					System.out.println(e.getEid());
				    System.out.println(e.getEname());
				    System.out.println(e.getSalary());
				    System.out.println(e.getContact());
				}
			}
	    }
			
}

	   
	
				
				
				
				
				
				
				
				
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

