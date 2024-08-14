package testNGFramework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2
{
	@Test(groups = "SmokeTestcase")
	public void TestCase1()
	{
		Reporter.log("This is Testcase 001",true);
	}
	
	@Test(groups = "SmokeTestcase")
	public void TestCase2()
	{
		Reporter.log("This is Testcase 002",true);
	}
	
	@Test(groups = "Functional Testcase")
	public void TestCase3()
	{
		Reporter.log("This is Testcase 003",true);
	}
	
	@Test(groups = "Functional Testcase")
	public void TestCase4()
	{
		Reporter.log("This is Testcase 004",true);
	}

}
