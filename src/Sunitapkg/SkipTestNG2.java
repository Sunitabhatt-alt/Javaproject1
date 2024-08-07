package Sunitapkg;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SkipTestNG2 {

	@Test
	public void a() {
		System.out.println("This is a");
	}
	
	@Test(invocationCount=2, priority= -1,  enabled =false & true)
	public void b(){
		System.out.print("This is b");
	}
	
	@Test(invocationCount=2)
	public void c() {
		System.out.println("This is c");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("This is d");
	}
}
