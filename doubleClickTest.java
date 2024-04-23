package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickTest {

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
		
		driver.findElement(By.partialLinkText("Double Click")).click();
		Thread.sleep(2000);
		
		WebElement   s = driver.findElement(By.id("btn20"));
		Actions action=new Actions(driver);
		action.doubleClick(s).perform();
		
		String actualresult= driver.findElement(By.xpath("//button[@id=\"btn20\"]/following-sibling::span")).getText();
		Thread.sleep(2000);
		String expectedresult="You selected \"Yes\"";
		Thread.sleep(2000);
		if(actualresult.equals(expectedresult))
		{
			System.out.println("Testcase pass");
		}
		else
		{
			System.out.println("Testcase fail");
		}
		
		driver.quit();
	}

}
