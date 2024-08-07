package Sunitapkg;

public class EH1 {

	public static void main(String[] args) {
		try {
 int a=5/0; //Arithmetic exception
 
	}catch(Exception a) {
		//a.printStackTrace();
		System.out.println(a);
		
	}
		System.out.print("Exception Handled");

}
}
