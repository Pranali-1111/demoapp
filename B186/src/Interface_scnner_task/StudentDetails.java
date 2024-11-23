package Interface_scnner_task;

import java.util.Scanner;

public class StudentDetails implements I {

	Scanner sc = new Scanner(System.in);
	Student st = new Student();
	
	@Override
	public void setData() {
	
		System.out.println("Enter rollno : ");
		st.setRollno(sc.nextInt());
		
		System.out.println("Enter name : ");
		st.setName(sc.next());
		
		System.out.println("Enter marks : ");
		st.setMarks(sc.nextDouble());
		
	}

	@Override
	public void getData() {
		
		System.out.println(st.getRollno());
		System.out.println(st.getName());
		System.out.println(st.getMarks());
	
	}

	@Override
	public void percetange() {
		

	if(st.getMarks() >= 75 && st.getMarks()<=100)
	{
		System.out.println("Marks is :  "+st.getMarks()+ " Result is : Distinction");
	}
	else if(st.getMarks()<75 && st.getMarks()>60)
	{
		System.out.println("Marks is : "+st.getMarks()+ " Result is : First Class");
	}
	else if(st.getMarks()>=35 && st.getMarks()<=59)
		{
			System.out.println("Marks is:"+st.getMarks()+"Result is: Second class");
		}
		else if(st.getMarks()<35)
		{
			System.out.println("Marks is:"+st.getMarks()+"Result is: Fail");
		}
	}

}
