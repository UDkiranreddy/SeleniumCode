package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag {
   @Test
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        Actions actions = new Actions(driver);        
       actions.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
       .moveToElement(driver.findElement(By.
       xpath("//div[@id='droppable']"))).release().build().perform();

	}

}
