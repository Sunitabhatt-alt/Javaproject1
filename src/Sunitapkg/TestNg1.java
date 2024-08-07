package Sunitapkg;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNg1 {

	
@Test
	public void e1() {
		System.out.println("This is Test1");
	} 
	
	@BeforeSuite
	public void a() {
		System.out.println("This is Before suite");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void c() {
		System.out.println("This is Before class");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("This is Before Method");
	}
	
	@Test
	public void E1() {
		System.out.println("This is E1 test");
	}
	
	@AfterMethod
	public void f() {
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void g() {
		System.out.println("This is after class");
	}
	
}
