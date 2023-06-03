package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class spice2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.spicejet.com/");
        //get parent window id through getwindowhandle
        String Art= driver.getWindowHandle();
        System.out.println(Art+driver.getTitle());
        driver.findElement(By.linkText("SpiceHolidays")).click();
        //how to get all window id or address title we want to use GwHs and set
       Set<String>child=driver.getWindowHandles();      
       for(String childname:child) {
       driver.switchTo().window(childname);  
       System.out.println(childname+driver.getTitle());
       }
      //here we perform on child class
       driver.findElement(By.xpath("//input[@name='txtDesCity']")).sendKeys("Go to Mountain to ladak");
      driver.findElement(By.name("PackageName")).sendKeys(" Adventure "); 
    
		
       //next switch to parent window
       driver.switchTo().window(Art);
       //here we perform to parent window
       driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
       driver.findElement(By.xpath("//div[contains(text(),'Cargo')]")).click();
	}

}
