package Collection_Framework;
import java.util.*;
public class Test2 {
	
	public static void main(String[] args) {
		
		List<Double> al=new ArrayList<>();
		
		al.add(50.21);
		al.add(60.30);
		al.add(90.21);
		al.add(100.12);
		System.out.println(al);
		
		Iterator<Double> itr=al.iterator();
		
		while(itr.hasNext())
		{
			Double d=itr.next();
			System.out.println(d);
		}
		
	}
	
	

	

}
