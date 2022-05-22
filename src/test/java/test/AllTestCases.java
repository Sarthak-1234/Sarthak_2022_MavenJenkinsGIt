package test;

import org.testng.annotations.Test;

public class AllTestCases {

	@Test
	public void SanityTestA() {
		System.out.println("Sanity Testcase A");
		System.out.println(System.getenv("keyUsingConfig"));
	}
	
	@Test
	public void SanityTestB() {
		System.out.println("Sanity Testcase B");
	}
	
	@Test
	public void RegressionTestA() {
		System.out.println("Regression Testcase A");
	}
	
	@Test
	public void RegressionTestB() {
		System.out.println("Regression Testcase B");
	}
	
}
