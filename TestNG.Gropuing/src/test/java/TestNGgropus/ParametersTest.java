package TestNGgropus;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

	@Test(priority = 1)
	@Parameters("singin")
	public void loginTest(String login) {
		System.out.println("This is a "+login);
	}
		
	@Test(priority = 2)
	@Parameters("product")
	public void productTest (String product) {
		System.out.println("This is a "+product);
	}
	
	@Test(priority = 3)
	@Parameters("checkout")
	public void checkoutTest(String checkout) {
		System.out.println("This is a "+checkout);
	}
	
	

}
