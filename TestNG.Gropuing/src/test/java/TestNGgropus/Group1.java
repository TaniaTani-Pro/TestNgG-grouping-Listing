package TestNGgropus;

import org.testng.annotations.Test;

public class Group1 {

	@Test(groups={"smoke","funnctionl","regression"})
	public void loginTest() {
		System.out.println(" login test demo");
	
	}
	
	@Test(groups = {"smoke","regression"})
	public void mouseHoverTest () {
		System.out.println("mouseHover test");
	}
	
	@Test(groups = {"smoke","loadtest","exploratory"})
	public void unitTest() {
		System.out.println();
	}
	
	
	@Test(groups = {"smoke"})
	public void dropdownTest() {
		System.out.println();
		
	}
}
