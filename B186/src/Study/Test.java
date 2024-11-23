package Study;

public class Test
{
	public static void main(String[]args)
	{
		Address adr=new Address();
		
		adr.setCityname("Nagpur");
		adr.setAreaname("shivajinagar");
		Student stu=new Student();
		  stu.setRollno(2);
		  stu.setName("pranali");
		  stu.setAddr(adr);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr().getCityname());
		System.out.println(stu.getAddr().getAreaname());
	}

}
