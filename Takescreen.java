package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreen {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://irctctourism.com/");
       //when you want to take a screenshot we need utilize take screenshot and driver to cast
         File sss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);         
       //we need to copy into our local machine with help of fileutils method
         FileUtils.copyFile(sss, new File("C:\\Users\\yella\\OneDrive\\Pictures\\Screenshots\\SSselenium\\Rail.png"));
      
       

	}

}
