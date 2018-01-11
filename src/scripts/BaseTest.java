package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POM.Homepage;

public class BaseTest  {
	
@BeforeMethod
public void setup(){
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
	
}
@AfterMethod
public void teardown(){
	
}
}
