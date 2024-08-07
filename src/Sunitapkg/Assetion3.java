package Sunitapkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assetion3 {

	@Test
	public void testAssertion1() {
		String ActualResult ="abc";
		String ExpectedResult = "ab";
	
		try {
			Assert.assertEquals(ActualResult, ExpectedResult);
		} catch (Error e) {
			e.printStackTrace();
		}
		System.out.println("Equal assertion verified");
	}
		
}
