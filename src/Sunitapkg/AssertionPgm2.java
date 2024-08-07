package Sunitapkg;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertionPgm2 {
@Test
public void testAssertion1() {
	String ActualResult ="ab";
	String ExpectedResult = "ab";
	
	int a=10;
	int b=20;
	
	Assert.assertEquals(ActualResult, ExpectedResult, "Assertion failed");
	System.out.println("Equal assertion verified");
	
	Assert.assertFalse(a>b);
	System.out.println("False assertion verified");
	
	Assert.assertTrue(a>b);
	System.out.println("True assertion verified");
	
}
	
@Test
public void TestAssertion2() {
	System.out.println("TestAssertion2 method");
}
}
