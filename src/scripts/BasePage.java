package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage extends BaseTest {
	 
//	public BasePage(WebDriver driver){
//		this.driver=driver;
//	}
	public void verifytitle(String title){
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is matching",true);
		}
		catch(Exception e){
			
			Reporter.log("title is not matching",true);
		}
	}
}
