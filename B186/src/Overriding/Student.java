package Overriding;

public class Student 
{
	private int Rollno;
	private String Name;

	
	
	public int getRollno() 
	{
		return Rollno;
	}
	public void setRollno(int rollno) 
	{
		this.Rollno = rollno;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name)
	{
		this.Name = name;
	}
	public String toString()
	{
		return "Rollno:-"+Rollno+"Name:-"+Name;
	}
	
}
