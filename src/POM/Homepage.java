package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import scripts.BasePage;

//google homepage
public class Homepage {
	public WebDriver driver;
	
//div[@class='tsf-p']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[@id='lst-ib']
@FindBy(xpath="//div[@class='tsf-p']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[@id='lst-ib']")
private WebElement searchfield;

public Homepage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void searchfunc() throws IOException{
	
	//Create an object of ReadGuru99ExcelFile class
    ReadGuru99ExcelFile objExcelFile = new ReadGuru99ExcelFile();
  //Prepare the path of excel file

    String filePath = System.getProperty("user.dir")+"\\Excel";

    //Call read file method of the class to read data
    searchfield.sendKeys(objExcelFile.readExcel(filePath,"excelproj1.xlsx","testsheet"));
    
}
}



