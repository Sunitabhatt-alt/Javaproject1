package Sunitapkg;

public class Constructor2 {
	int id=1;
String name;
String address;

Constructor2(){
	System.out.println("Default constructor");
}

Constructor2(int a, String b, String c){
	this.id=a;
	this.name=b;
	this.address=c;
}

public void print() {
	System.out.println(id+ " "+name+ " "+address);
}

	public static void main(String[] args) {
		
		Constructor2 C2=new Constructor2();
		Constructor2 c3=new Constructor2(1, "john", "abc");
		c3.print();
		Constructor2 c4=new Constructor2(2, "varun", "abc2");
		c4.print();
	}

}
