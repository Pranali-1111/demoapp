package Study;

public class Student
{
	private int Rollno;
	private String name;
	private Address addr;
	
	
	public Address getAddr()
	{
		return addr;
	}
	public void setAddr(Address addr)
	{
		this.addr=addr;
		
	}
	public int getRollno()
	{
		return Rollno;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setRollno(int Rollno)
	{
		this.Rollno=Rollno;
	}
	}


