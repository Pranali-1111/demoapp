package Collection_Framework;

import java.util.Set;
import java.util.TreeSet;

public class Test_Student2 {
	
public static void main(String[] args) {
		
		Set<Student2> s=new TreeSet<>();
		
		Student2 stu1=new Student2();
		        stu1.setRollno(3);
		        stu1.setName("bbb");
		        
		Student2 stu2=new Student2();
		        stu2.setRollno(1);
		        stu2.setName("ccc");
		        
		Student2 stu3=new Student2();
		        stu3.setRollno(2);
		        stu3.setName("aaa");
		        
		        s.add(stu1);
		        s.add(stu2);
		        s.add(stu3);
		        
		  for(Student2 stu : s)
		  {
			  System.out.println(stu.getRollno());
			  System.out.println(stu.getName());
		  }
		        
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


