package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Gettext {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://education.nationalgeographic.org/resource/agriculture/");
        String expectTitle="The Art and Science of Agriculture";        
        String actual=driver.getTitle();
        Assert.assertEquals(actual, expectTitle);
      //  driver.close();
       // System.out.println(driver.getTitle());
       boolean donate= driver.findElement(By.xpath("//a[@class='px-3 btn btn-primary']")).isDisplayed();
       
	}

}
