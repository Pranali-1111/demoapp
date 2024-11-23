package Interface_scnner_task;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		I i = new StudentDetails();
		
		while(true)
		{
			
			System.out.println("1.Save Student \n2.View Student \n3.Show Result \n4.Exit");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1 :
				i.setData();
				break;
				
			case 2:
				i.getData();
				break;
				
			case 3:
				i.percetange();
				break;
				
			case 4:
				System.exit(0);
				break;
				
				default:
					System.out.println("INVALID CHOICE .......");
					break;
			}
		}
	}
}
