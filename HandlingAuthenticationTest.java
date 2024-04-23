package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       
    
       driver.get("https://demoapps.qspiders.com/");
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
       Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='Web Elements']")).click();
		   Thread.sleep(4000);
		//click on Frames
		driver.findElement(By.xpath("//section[.=\"Frames\"]")).click();
		   Thread.sleep(4000);
		//click on iframes
		driver.findElement(By.xpath("//section[.=\"iframes\"]")).click();
		   Thread.sleep(4000);
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		   Thread.sleep(4000);
		driver.switchTo().frame(0);
	
		Thread.sleep(3000);
		String mail=driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		String pass=driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		String Confirm=driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys(Confirm);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.id("submitButton")).click();
	}

}