package Sunitapkg;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG2 {
	@Test
	public void a() {
		System.out.println("a");
	}

@BeforeTest
public void b() {
	System.out.println("b");	
}

@BeforeMethod
public void e() {
	System.out.println("e");
}

@Test
public void c() {
	System.out.println("c");
}

@AfterTest
public void d() {
	System.out.println("d");	
}
@Test
public void AB() {
	Assert.assertTrue(3>5);
	System.out.println("failed");
}
}
