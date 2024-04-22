package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframeTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(5000);
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("username")).sendKeys("nandanms");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("nandan@1234");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.linkText("Multiple iframe")).click();
	}
}
