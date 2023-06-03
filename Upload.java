package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
       		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.automationtesting.in/Register.html");
			
//             action.click(driver.findElement(By.xpath("//input[@id='imagesrc']"))). build().perform();
//            Robot robot=new Robot();
			driver.findElement(By.xpath("//input[@id='imagesrc']"))
			.sendKeys("C:\\Users\\yella\\OneDrive\\Pictures\\Screenshots\\Screenshot (7).png");
			Thread.sleep(3000);
			driver.switchTo().newWindow(WindowType.TAB);			
			driver.get("http://omayo.blogspot.com/");
			
			 driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\yella\\OneDrive\\Pictures\\Screenshots\\Screenshot (7).png");
           // Actions action=new Actions(driver);
	}

}
