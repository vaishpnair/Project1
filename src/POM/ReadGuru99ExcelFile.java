package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadGuru99ExcelFile {
	String value="";
	public String readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    //Create an object of File class to open xlsx file

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
	    	for (int j = 0; j < row.getLastCellNum(); j++) {
	    		   value=row.getCell(j).getStringCellValue();
	    		   
	    		   
	    	   }
	    }
	    return value;
	}

public static void main(String...strings) throws IOException{
	

}
}
