package Collection_Framework;

import java.util.*;

public class Test1 {
	
	public static void main(String[] args) {
		
		List<String> al=new ArrayList<>();
		
		   al.add("bbb");//0
		   al.add("aaa");//1
		   al.add("ccc");//2
		   al.add("aaa");//3
		   System.out.println(al);
		   
		   Iterator<String> itr=al.iterator();
		      while(itr.hasNext())//true 
		      {
		    	  String s=itr.next();
			      System.out.println(s);
		      }
		      
	}
		
	}

// 0=bbb -> true -> bbb
// 1=aaa -> true -> aaa
// 2=ccc -> true -> ccc
// 3=aaa -> true -> aaa
// 4=null-> false-> program end