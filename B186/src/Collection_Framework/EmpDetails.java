package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ArrayPractice.Employee;

public class EmpDetails {
 
	List<Employee> empList= new  ArrayList<>();
	
	public void createEmp()
	{
		Employee e= new Employee();
		
		e.setEid(111);
		e.setEname("Pranali");
		e.setSalary(80000.50);
	
		
Employee e2= new Employee();
		
		e2.setEid(222);
		e2.setEname("Aqwe");
		e2.setSalary(56000.50);
		
		empList.add(e);
		empList.add(e2);
	}
	public void showEmp()
	{
		Iterator<Employee> itr= empList.iterator();
		while(itr.hasNext())
		{
			Employee emp=itr.next();
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
			System.out.println(emp.getSalary());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
