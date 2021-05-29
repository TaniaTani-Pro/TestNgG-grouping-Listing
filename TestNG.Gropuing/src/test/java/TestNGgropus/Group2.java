package TestNGgropus;

import org.testng.annotations.Test;

public class Group2 {

	@Test(groups={"smoke","funnctionl","regression"})
	public void loginTest() {
		System.out.println(" login test demo = group2");
	
	}
	
	@Test(groups = {"smoke","regression"})
	public void mouseHoverTest () {
		System.out.println("mouseHover test = group2");
	}
	
	@Test(groups = {"smoke","loadtest","exploratory = group2"})
	public void unitTest() {
		System.out.println();
	}
	
	
	@Test(groups = {"smoke = group2"})
	public void dropdownTest() {
		System.out.println();
		
	}
}
