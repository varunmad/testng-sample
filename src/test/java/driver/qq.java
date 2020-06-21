package driver;

import org.testng.annotations.Test;

public class qq {
	@Test(groups="smoke")
	private void tc11(){
		System.out.println("test1");
	}

	@Test(groups="regression")
	private void tc22() {
		System.out.println("test2");
	}

	
	
}
