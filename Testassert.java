package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Testassert {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        SoftAssert soft = new SoftAssert();
        driver.findElement(By.name("firstname")).sendKeys("Wendsdayy");
        driver.findElement(By.name("lastname")).sendKeys("Adams");
        String actualtext=driver.findElement(By.name("lastname")).getAttribute("value");
        String ExpectText="Adams";
        soft.assertEquals(actualtext, ExpectText,"text equals");
        
        String actualboder=driver.findElement(By.name("lastname")).getCssValue("border");
        String expe ="1px solid #ccd0d5";
        soft.assertEquals(actualboder,expe);
       String colur= driver.findElement(By.name("reg_email__")).getCssValue("border-color");
       String expectcolour="rgb(204, 208, 213)";
       soft.assertEquals(colur, expectcolour);
        
	}

}
