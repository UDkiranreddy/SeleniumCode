package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys {

	public static void main(String[] args ) {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement jyo = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			jyo.sendKeys("Wendsday black");
			jyo.sendKeys(org.openqa.selenium.Keys.CONTROL+"c");
		WebElement jeg=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			jeg.sendKeys(org.openqa.selenium.Keys.CONTROL+"v");
	    List<WebElement> links = driver.findElements(By.tagName("a"));
		   System.out.println("tptal links print" +links.size());
		   int size =links.size();
		   

	}

}
