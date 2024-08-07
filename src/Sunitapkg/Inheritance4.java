package Sunitapkg;

public class Inheritance4 extends Inheritance3{
	
	public void multiple(int x, int y) {
		int z= x*y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		int x=10, y=5;
		Inheritance4 I4= new Inheritance4();
		I4.add(x,y);
		I4.substract(x, y);
		I4.multiple(x, y);

	}

}
