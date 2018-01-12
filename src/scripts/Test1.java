package scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import scripts.BasePage;
import POM.Homepage;

public class Test1 extends BaseTest{

	@Test
	public void testmethod1() throws IOException, InterruptedException{
		Homepage home=new Homepage(driver);
					
		Thread.sleep(3000);
		home.searchfunc();
		Thread.sleep(3000);
		
	}
}
