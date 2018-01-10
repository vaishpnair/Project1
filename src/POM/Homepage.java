package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//google homepage
public class Homepage extends ReadGuru99ExcelFile {
public WebDriver driver;
	
//div[@class='tsf-p']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[@id='lst-ib']
@FindBy(xpath="//div[@class='tsf-p']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[@id='lst-ib']")
private WebElement searchfield;

public Homepage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void searchfunc(){
	searchfield.sendKeys();
}

}
