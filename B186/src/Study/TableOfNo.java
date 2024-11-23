package Study;

import java.util.Scanner;

// scanner class -> import java.util.scanner;
public class TableOfNo 
 {
 public static void main(String[] args) 
 {
//  int no = 5  // 5*1 5*2 5*3.......5*10
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter no.");
	 int no=sc.nextInt();
	 
     for(int i=1; i<=10; i++);
     {
		 System.out.println(no * i);
     }
 }

 }

  

 
	
   