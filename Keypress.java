package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keypress {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("pdfbox")).sendKeys("Era2020");
		//pressing key using with help of keypress and keyrelease
		Robot meachine = new Robot();
        meachine.keyPress(KeyEvent.VK_SHIFT);
        meachine.keyPress(KeyEvent.VK_W);       
        meachine.keyRelease(KeyEvent.VK_W);
        meachine.keyRelease(KeyEvent.VK_SHIFT);
        
        meachine.keyPress(KeyEvent.VK_E);       
        meachine.keyRelease(KeyEvent.VK_E);
        
        meachine.keyPress(KeyEvent.VK_D);       
        meachine.keyRelease(KeyEvent.VK_D);
        
        meachine.keyPress(KeyEvent.VK_S);       
        meachine.keyRelease(KeyEvent.VK_S);
        
        meachine.keyPress(KeyEvent.VK_BACK_SLASH);       
        meachine.keyRelease(KeyEvent.VK_BACK_SLASH);
        driver.findElement(By.xpath("//button[@id='createPdf']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
        Thread.sleep(3000);
        Alert alert= driver.switchTo().alert();
        alert.dismiss();
        
		
		
	}

}
