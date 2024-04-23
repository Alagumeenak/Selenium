package dropdown;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMultipleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//section[.='Web Elements']")).click();
		   Thread.sleep(1000);
        driver.findElement(By.xpath("//section[.='Popups']")).click();
        driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
        driver.findElement(By.partialLinkText("Multiple Windows")).click();
        driver.findElement(By.id("browserButton3")).click();
       Set<String> allWindow=driver.getWindowHandles();
       System.out.println(allWindow.size());
       for (String window : allWindow) {
    	   driver.switchTo().window(window);
    	   if(driver.getCurrentUrl().contains("SignUpPage")) {
    		   break;   
    	   } 
		
	}
       
      driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
      driver.findElement(By.id("password")).sendKeys("babies");
      driver.findElement(By.id("confirm-password")).sendKeys("babies");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
