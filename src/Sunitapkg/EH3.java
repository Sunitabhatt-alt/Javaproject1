package Sunitapkg;

public class EH3 {
	public static void a(int age) {
		try {
			if (age<18) {
				throw new ArithmeticException("Not Applicable"); 
			}else {
				System.out.println("Applicable");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ArithmeticException, Exception, InterruptedException{
		Thread.sleep(1000);
		a(15);
		//a(19);
		  
	}

}
