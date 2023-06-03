package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openwindow {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
        driver.get("https://www.amazon.in/");
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.spicejet.com/");
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.spicejet.com/");
        

	}

}
