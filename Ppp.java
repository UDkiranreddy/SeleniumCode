package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ppp {

	public static void main(String[] args) throws IOException  {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        FileInputStream file = new  FileInputStream("C:\\Users\\yella\\OneDrive\\Desktop\\Facebook.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet s = book.getSheet("Sheet1");
	     int row =s.getLastRowNum();
	     System.out.println(row);
	     
	     for (int i=1;i<row;i++) {
	    	XSSFRow R =s.getRow(i);
	    	String type=R.getCell(0).toString();
	    	String type1=R.getCell(1).toString();
	    	int value =(int) R.getCell(3).getNumericCellValue();
	    	System.out.println(type);	   
	     
	     driver.findElement(By.name("firstname")).sendKeys(type);
         driver.findElement(By.name("lastname")).sendKeys(type1);
         
         driver.findElement(By.name("reg_email__")).sendKeys(String.valueOf(value));
	     }    
	     
	     
	     
	     
	     
	     
	     
	     
	     
//	     int cell = s.getRow(1).getLastCellNum();
//	     System.out.println(cell);
	     

		
	}

}
