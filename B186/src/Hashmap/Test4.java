package Hashmap;

import java.util.HashSet;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		
		Set<Integer> al=new HashSet<>();
		     al.add(1);
		     al.add(2);
		     al.add(4);
		     al.add(8);
		     al.add(22);
		     al.add(8);
		     
		     System.out.println("Lamda Expression");
		     al.forEach(x->System.out.println(x));
	}
}
