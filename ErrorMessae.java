package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ErrorMessae {
@SuppressWarnings("deprecation")
@Test(dataProvider="login")
	public void Error (String email, String password) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);       
        driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(2000);
        
//        String actualerror = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
//        String expect ="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
//        Assert.assertEquals(actualerror, expect);
       // driver.close();        
	}
     @DataProvider(name="login")
     public Object[][] Datainput() {
    	 Object data[][]= new Object [2][2];
    	 data[0][0]="jessy@gmail.com";
    	 data[0][1]="pinkman";

    	 data[1][0]="wendsday";
    	 data[1][1]="wends123";
	 
 //	 data[3][1]="wends123";
	 return data;
}

}
