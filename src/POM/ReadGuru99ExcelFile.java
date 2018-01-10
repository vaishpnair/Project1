package POM;

import java.io.IOException;

public class ReadGuru99ExcelFile {
	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
	
	}

public static void main(String...strings) throws IOException{
	//Create an object of ReadGuru99ExcelFile class
    ReadGuru99ExcelFile objExcelFile = new ReadGuru99ExcelFile();
  //Prepare the path of excel file

    String filePath = System.getProperty("user.dir")+"\\Excel";

    //Call read file method of the class to read data

    objExcelFile.readExcel(filePath,"excelproj1.xlsx","testsheet");
}
}
