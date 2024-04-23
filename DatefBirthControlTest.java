package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DatefBirthControlTest {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[.='Date & Time Picker']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[.='Date Picker']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.partialLinkText("Icon Trigger")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='relative']//*[name()='svg']")).click();
			Thread.sleep(2000);

			while (!driver.findElement(By.cssSelector("[class='react-datepicker__current-month']")).getText()
					.equals("March 2000")) {

				// Click on Previous month button
				driver.findElement(By.cssSelector("[aria-label='Previous Month']")).click();
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='23']")).click();

		}
	

}
