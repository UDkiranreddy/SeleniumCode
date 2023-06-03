package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrool {

		public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);       
        driver.get("https://www.amazon.in/");
        JavascriptExecutor jse = (JavascriptExecutor )driver;
       // jse.executeScript("window.scrollBy(0,2500)");
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
