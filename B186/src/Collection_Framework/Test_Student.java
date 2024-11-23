package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_Student {

	public static void main(String[] args) {
		
		List<Student> al=new ArrayList<>();
		
		Student s1=new Student();
		    s1.setRollno(1);
		    s1.setName("xyz");  
		    
		Student s2=new Student();
		    s2.setRollno(2);
		    s2.setName("pqr");
		      al.add(s1);
		      al.add(s2);
		 
	   Iterator<Student>itr=al.iterator();
	       while(itr.hasNext())
	       {
	    	   Student stu=itr.next();
	    	   System.out.println(stu.getRollno());
	    	   System.out.println(stu.getName());
	       }
		
	}
}
