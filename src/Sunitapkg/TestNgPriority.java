package Sunitapkg;

import org.testng.annotations.Test;

public class TestNgPriority {

	@Test(priority = -10)
	public void a() {
		System.out.println("a method");
	}
	
	@Test(priority = 0)
	public void A1() {
		System.out.println("A1 method");
	}
	
	@Test(priority = 1)
	public void A2() {
		System.out.println("A2 method");
	}
	
	@Test
	public void ab() {
		System.out.println("ab Method");

}
}
