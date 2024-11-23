package Study;

public class Test4 
{
	public void m1(Student s)
	{
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}
	public static void main(String[] args) 
	{
		
		Test4 t=new Test4();
		
		Student stu= new Student();
		stu.setRollno(1);
		stu.setName("Pranali");
		
		t.m1(stu);
		
	}
		
	}
	
	
