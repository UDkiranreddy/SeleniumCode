package selenium;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
     @SuppressWarnings("deprecation")
	@org.testng.annotations.Test
	   public void login() {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
   
        driver.findElement(By.name("username")).sendKeys("Admin"); 
        driver.findElement(By.name("password")).sendKeys("admin123"); 
        driver.findElement(By.xpath("//button[@type='submit']")).click();	
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.switchTo().alert().dismiss();
	}	

}
