package Sunitapkg;

public class EH2 {

	public static void main(String[] args) {
	String str=null;
	
 try {
	System.out.println(str.length());
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 System.out.println("Exception Handled -1");
 
 String str2 ="Selenium";
try {
	int a = Integer.parseInt(str2);
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Exception Handled -2");

int a[] =new int[5];
int c;
try {
	c = a[55];
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Exception Handled -3");

 
 
	}
	
	

}
