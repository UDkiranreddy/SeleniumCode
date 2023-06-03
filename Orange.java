package selenium;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        FileInputStream file = new FileInputStream("C:\\Users\\yella\\OneDrive\\Documents\\Orange.xlsx");
        XSSFWorkbook work = new XSSFWorkbook(file);
        XSSFSheet paper = work.getSheet("Sheet1");        
        int type= paper.getLastRowNum();      
        System.out.println(type);    
        
        for (int i=2;i<=type;i++) {
        XSSFRow row =paper.getRow(i);
        String name =row.getCell(0).toString();
        String password = row.getCell(1).toString();
     driver.findElement(By.name("username")).sendKeys(name); 
     driver.findElement(By.name("password")).sendKeys(password); 
     
        }
	}

}
