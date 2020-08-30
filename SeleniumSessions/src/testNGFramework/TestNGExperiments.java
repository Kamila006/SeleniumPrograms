package testNGFramework;

import org.testng.annotations.Test;

public class TestNGExperiments {

	@Test
	public void F1()
	{
		System.out.println("printing F1");
	}
	@Test
	public void F2()
	{
		System.out.println("printing F2");
	}
	@Test(enabled = false)
	public void F3()
	{
		System.out.println("printing F3");
	}
	@Test
	public void F4()
	{
		System.out.println("printing F4");
	}
	@Test(dependsOnMethods = "F6")
	public void F5()
	{
		System.out.println("printing F5");
	}
	@Test
	public void F6()
	{
		System.out.println("printing F6");
	}
	
	
}
