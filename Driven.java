package selenium;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driven {

	public static void main(String[] args) throws IOException{
//		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        FileInputStream file = new FileInputStream("C:\\Users\\yella\\OneDrive\\Desktop\\Facebook.xlsx");  
        //to connect workbook
        XSSFWorkbook book =new XSSFWorkbook(file);
        //to connect sheet is insides workbook
        XSSFSheet sheet = book.getSheet("Sheet1");
        //to get row into sheet
        int rows = sheet.getLastRowNum();
        System.out.println(rows);
        //to get columns in rows
      int colum=  sheet.getRow(2).getLastCellNum();
        //int colum = sheet.getLeftCol();
        System.out.println(colum);
        // read to each row value in workbook
        
        for (int i =0; i<rows; i++) {
        	XSSFRow current = sheet.getRow(i);
        	//to read each cell
        	for (int J=1;J<colum;J++) {
        		String value =current.getCell(J).toString();
        		System.out.print(value+" ");       		
        	}
        	System.out.println();
        }
        
	}

}
