package Sunitapkg;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestNG {

	//@Test
	public void a() {
		System.out.println("This is method A");
	}
	
	@Test(enabled = false)
	public void b() {
		System.out.println("This is method B");
	}
	
	@Test(enabled = true)
	public void c() {
		System.out.println("This is method C");
	}
	
	//InvocationCount
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("This is method d");
	}
	
	@Test(invocationCount = 0)
	public void e() {
		System.out.println("This is method e");
	}
	 
	//Conditional skipped
	@Test
	public void f() {
		System.out.println("this is f method");
		throw new SkipException("Skip f test method");
	}
}
