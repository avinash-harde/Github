package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
		System.out.println("Changes for github");
		System.out.println("Changes for github2");
	}
	@Test(groups={"Smoke"})
	public void ploan2()
	{
		System.out.println("good");
		System.out.println("branch Changes for github");
		System.out.println("first branch Changes for github2");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}
