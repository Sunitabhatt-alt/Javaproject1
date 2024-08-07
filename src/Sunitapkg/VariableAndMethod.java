package Sunitapkg;

public class VariableAndMethod {
	int a=5; //Global variable
	static int b =10; //static variable

	public static void main(String[] args) {
		int c =15; //local variable
		System.out.println(c); //15 -Calling a variable
		
		//calling a static member
		d();
		System.out.println(b);
		
		
		//Another way of calling static method
		VariableAndMethod.d();
		System.out.println(VariableAndMethod.b);
		
		//Non static member calling
		VariableAndMethod VM8 = new VariableAndMethod();
		VM8.f();
		System.out.println(VM8.a);

	}
	
	//Static method
	public static void d() {
		int e=20;
		System.out.println(e);
	}

	//Non Static method
	public void f() {
		int g=30;
		System.out.println(g);
	}
}
