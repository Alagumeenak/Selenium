
package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PrintPopuTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);

		//Click on Others
		driver.findElement(By.xpath("//section[.='Others']")).click();
		Thread.sleep(2000);

		//Click on Print
		driver.findElement(By.xpath("//section[.='Print']")).click();
		Thread.sleep(2000);

		//Click on Print this out button
		driver.findElement(By.xpath("//button[.='Print this out!']")).click();
		Thread.sleep(2000);

		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		driver.quit();

	}
}
