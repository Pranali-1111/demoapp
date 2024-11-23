package Overriding;

public class Test_Student 
{
	public static void main(String[] args)
	{
		Student stu=new Student();
		
		stu.setRollno(11);
		stu.setName("Pranali");
		
		Student stu1=new Student();
		stu1.setRollno(5);
		stu1.setName("xyz");
		
	  /*System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu1.getRollno());
		System.out.println(stu1.getName());
		*/
		
		System.out.println(stu);//stu.tostring();
		System.out.println(stu1);//stu1.tostring();
				
		
		
	}

}
