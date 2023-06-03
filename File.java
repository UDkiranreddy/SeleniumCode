package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class File {
    @Test
	public void foot() throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	        driver.get("https://www.amazon.in/");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//i[@class='a-icon a-icon-previous-rounded']")).click();
//	        Actions actions = new Actions(driver);

	}
    public class File2 {
        @Test
    	public void foot() throws InterruptedException {
    			System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
    	        WebDriver driver = new ChromeDriver();
    	        driver.manage().window().maximize();
    	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
    	        driver.get("https://www.amazon.in/");
    	        Thread.sleep(2000);
    	        driver.findElement(By.xpath("//i[@class='a-icon a-icon-previous-rounded']")).click();
//    	        Actions actions = new Actions(driver);

    	}

    }
    }
