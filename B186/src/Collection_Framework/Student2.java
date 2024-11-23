package Collection_Framework;

public class Student2 implements Comparable<Student2> {
	
	private int rollno;
	private String name;
	
	
	public int getRollno() {
	   return rollno;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	  public int compareTo(Student2 st)
	  {
		  
	   return st.rollno-this.rollno;
    	//return this.name.compareTo(st.name);


}
}
