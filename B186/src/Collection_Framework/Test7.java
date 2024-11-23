package Collection_Framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test7 {

	public static void main(String[] args) {
		
		List<String>l=new ArrayList<>();
		          l.add("bbb");
		          l.add("aaa");
		          l.add("ccc");
		          l.add("aaa");
		          System.out.println(l);
		          
		          Set<String> s=new HashSet<>(l);
		          System.out.println(s);
		          
//		          Set<String> s1=new(intedHashset(l));
//		          System.out.println(s1);
	}

}