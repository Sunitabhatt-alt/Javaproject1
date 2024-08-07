package Sunitapkg;

public class Encapsulation {
	String name;
	int b=5;
	final int c=2;
	
	/*public void a() {
		c=6;
	}*/
	
	final void a() {
		System.out.println("final method");
	
	}
	
	public void SetName(String s) {
		this.name=s;
		this.b=5;
		System.out.println(b);
		System.out.println(c);
		
	}
	public String getName() {
		return name;
	}

}
