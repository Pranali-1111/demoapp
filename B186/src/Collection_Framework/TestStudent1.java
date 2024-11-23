package Collection_Framework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent1 {
 
	public static void main(String[] args) {
		
		Set<Student1> s=new LinkedHashSet<>();
		
		Student1 stu1=new Student1();
		        stu1.setRollno(3);
		        stu1.setName("bbb");
		        
		Student1 stu2=new Student1();
		        stu2.setRollno(1);
		        stu2.setName("ccc");
		        
		Student1 stu3=new Student1();
		        stu3.setRollno(2);
		        stu3.setName("aaa");
		        
		        s.add(stu1);
		        s.add(stu2);
		        s.add(stu3);
		  for(Student1 stu:s)
		  {
			  System.out.println(stu.getRollno());
			  System.out.println(stu.getName());
		  }
		        
	}
}
