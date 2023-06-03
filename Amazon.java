package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);       
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='a-icon a-icon-previous-rounded']")).click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))).build().perform();       
//        driver.findElement(By.linkText("Create a Wish List")).click();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//      
       
	}

}
