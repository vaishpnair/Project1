package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//modified version----------------16th jan
public class ReadGuru99ExcelFile {
	public WebDriver driver;
	@FindBy(xpath="//div[@class='tsf-p']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[@id='lst-ib']")
	private WebElement searchfield;
	
	public ReadGuru99ExcelFile(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	String value[];
	public String[] searchfunc() throws IOException, InterruptedException{
		 String filePath = System.getProperty("user.dir")+"/Excel";
	     String fileName= "excelproj1.xlsx";
		 String sheetName="testsheet";
	    File file =    new File(filePath+"/"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);
	  //If it is xlsx file then create object of XSSFWorkbook class

	    Workbook guru99Workbook = new XSSFWorkbook(inputStream);

	    //Read sheet inside the workbook by its name

	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
	    for (int i = 0; i < rowCount; i++) {
	    	Row row = guru99Sheet.getRow(i);
	    	for (int k=0,  j = 0; j < row.getLastCellNum(); j++,k++) {
	    		   
	    		   searchfield.sendKeys(row.getCell(j).getStringCellValue());
	    		   Thread.sleep(3000);
	    		   searchfield.clear();
	    		  // Thread.sleep(3000);
	    	   }
	    	 
	    }
	   return value;
	}

public static void main(String...strings) throws IOException{
	

}
}
