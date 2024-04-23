package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClickTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[.='Button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Right Click")).click();
		Thread.sleep(2000);
		WebElement right1 =driver.findElement(By.id("btn30"));
		Actions action=new Actions(driver);
		action.contextClick(right1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.=\"Yes\"]")).click();
		Thread.sleep(2000);
		String actual=driver.findElement(By.xpath("//button[@id='btn30']/following-sibling::span")).getText();
		Thread.sleep(2000);
		String expected="You selected \"Yes\"";
		if(actual.equals(expected))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		driver.quit();

	}

}
