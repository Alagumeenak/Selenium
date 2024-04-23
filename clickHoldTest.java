package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickHoldTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Web Elements']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Click & Hold']")).click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement circle = driver.findElement(By.id("circle"));
		action.clickAndHold(circle).perform();
		Thread.sleep(5000);
		action.release(circle).perform();
		Thread.sleep(2000);
		driver.quit();

	}
}