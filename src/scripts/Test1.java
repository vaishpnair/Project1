package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import scripts.BasePage;
import POM.Homepage;
import POM.ReadGuru99ExcelFile;
//modified version--------------------16th jan
public class Test1 extends BaseTest{

	@Test
	public void testmethod1() throws IOException, InterruptedException{
//		Homepage home=new Homepage(driver);
		ReadGuru99ExcelFile home=new ReadGuru99ExcelFile(driver);				
		
		home.searchfunc();
		
		
	}
}
