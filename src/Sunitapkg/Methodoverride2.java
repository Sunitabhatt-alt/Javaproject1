package Sunitapkg;

public class Methodoverride2 extends Methodoverride1 {
	public void eat() {
		System.out.println("You are eating");
	}

	public static void main(String[] args) {
		Methodoverride2 MO2= new Methodoverride2();
		MO2.eat();
		
		
        Methodoverride1 Mo1=new Methodoverride1();
        Mo1.eat();
        }

}
