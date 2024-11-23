package Collection_Framework;
import java.util.*;
public class Test3 {
	
public static void main(String[] args)
{
	
	List<Character> al=new ArrayList<>();
	
	    al.add('a');
       	al.add('b');
	    al.add('c');
	    al.add('d');
	    al.add('e');
	
	Iterator<Character> itr=al.iterator();
	      while(itr.hasNext())
	      {
		      Character c=itr.next();
		      System.out.println(c);
	}
	
	
}
}