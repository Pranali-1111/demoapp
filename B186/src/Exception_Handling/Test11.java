package Exception_Handling;

public class Test11 {

	public int m1()
	{
		
		System.out.println("m1-");
		if(true)
			return 10;
		System.out.println("Hello");
		return 20;
	}
	
	public static void main(String[] args) {
		
		System.out.println("main-start");
		
		Test11 t=new Test11();
		int y = t.m1();
		System.out.println(y);
	}
}
