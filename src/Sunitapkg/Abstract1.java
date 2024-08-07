package Sunitapkg;

public abstract class Abstract1 {

	static int a=10;
	int b=5;
	final int c=2;
	
	//Abstract method
	abstract void abc();
	
	//Non abstract method
	public static void test() {
		System.out.println("non abstrat method");
	}
	
}
