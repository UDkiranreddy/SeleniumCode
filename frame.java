package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class frame {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
        driver.get("https://www.chase.com/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.switchTo().frame(0);
        
        driver.findElement(By.name("userId")).sendKeys("Wendsday");
        driver.findElement(By.id("password-text-input-field")).sendKeys("Wendsday10");
        driver.findElement(By.xpath("//input[@id='input-rememberMe']")).click();
        driver.findElement(By.xpath("//button[@id='signin-button']")).click();
        

	}

}
