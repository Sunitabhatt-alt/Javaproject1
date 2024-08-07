package Sunitapkg;

public class Inheritance7 extends Inheritance6{

	public void eat() {
		System.out.println("I am eating");
	}

	public static void main(String[] args) {
		Inheritance7 I7=new Inheritance7();
		I7.read();
		I7.write();
		I7.eat();
	}

}
