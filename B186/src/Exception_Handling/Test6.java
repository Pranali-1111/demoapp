package Exception_Handling;

public class Test6 {
public static void main(String[] args) {
	try
	{
		System.out.println("try-block-start");
		int x=10/5;
		System.out.println("try-block-end");
	}
	finally
	{
		System.out.println("finally-block");
		
	}
	System.out.println("program-end");
}
}
