package testNGFramework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void Testcase1()
	{
		Reporter.log("Hello",true);
	}

}
