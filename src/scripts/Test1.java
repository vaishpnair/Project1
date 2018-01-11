package scripts;

import org.testng.annotations.Test;

import POM.Homepage;

public class Test1 extends BaseTest {

	@Test
	public void testmethod1(){
		Homepage home=new Homepage(driver);
	}
}
