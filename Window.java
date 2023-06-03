package selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:/Users/yella/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://irctctourism.com/");
        //get parentwindow address and name
      String parentwindow  = driver.getWindowHandle();
      System.out.println("name or adress "+parentwindow+driver.getTitle());
     driver.findElement(By.linkText("Visit India")).click();   
     Set<String> Handles= driver.getWindowHandles();
      for(String Handle:Handles) {
    	 if(!Handles.equals(parentwindow)) {
    	 driver.switchTo().window(Handle);
    	System.out.println(Handle+driver.getTitle());
    	Thread.sleep(3000);
    	 driver.findElement(By.linkText("Login")).click();
    	 driver.findElement(By.name("username")).sendKeys("Urenaas");
    	 driver.findElement(By.name("password")).sendKeys("priya");
    	driver.close();
    	 } 
    	 
//    	 Alert alert=driver.switchTo().alert();
//    	 alert.dismiss();  	
      }
      Thread.sleep(2000);
      driver.switchTo().window(parentwindow);
      driver.findElement(By.xpath("//div[@class='Nav-icons BusTickets']")).click();
     // click on the new visit window
    // driver.findElement(By.linkText("Visit India")).click();
//     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//     driver.switchTo().window(tabs.get(0));
//     String ant=
//     driver.getTitle();System.out.println("get india visit title "+ant);
//     driver.findElement(By.xpath("//a[contains(text(),'View Details')]")).click();
     
    // Thread.sleep(3000);
       //driver.close();
	}

}
