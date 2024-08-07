package Sunitapkg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
@Test
public void a() {
	Assert.assertTrue(3<5);
	System.out.println("this is a");
}

@Test
public void b() {
	Assert.assertTrue(4<5 & 7>10);
	System.out.println("this is b");
}

@Test(dependsOnMethods = {"a","b"})
public void c() {
	System.out.println("This is c");
}
	
}
