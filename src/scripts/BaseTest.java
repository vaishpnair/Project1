package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POM.Homepage;

public class BaseTest  {
	public WebDriver driver;                                                                                                                    
@BeforeMethod
public void setup(){
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
	driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
}
@AfterMethod
public void teardown(){
	driver.close();
}
}
