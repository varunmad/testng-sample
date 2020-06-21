package driver;

import org.testng.annotations.Test;

public class PP {
			@Test(groups= {"regression","sanity"})
		private void tc1(){
			System.out.println("test1");
		}

		@Test(groups="smoke")
		private void tc2() {
			System.out.println("test2");
		}

		
		
}
