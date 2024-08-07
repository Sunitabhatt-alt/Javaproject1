package Sunitapkg;

public class Static1 {
	
	int roll;
	String name;
	String college = "IIt Bombay";
	
	Static1(int r, String n){
		roll = r;
		name = n;
	}

	public void getResult() {
		System.out.println(roll+ " "+name+" "+college);
	}
}
