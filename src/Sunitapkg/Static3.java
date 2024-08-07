package Sunitapkg;

public class Static3 {

	static int z =5;
	int y=1;
	public static void p() {
		z=10;
		System.out.println(z);
	
	}
	
	public void a() {
		z=15;
		System.out.println(z);
		p();
	}
	public static void main(String[] args) {
		System.out.println(z);
		p();
		Static3 s3 =new Static3();
		s3.a();
	}
}
