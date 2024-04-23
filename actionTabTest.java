package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionTabTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new FirefoxDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoapps.qspiders.com/");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//section[.='Web Elements']")).click();
		   Thread.sleep(1000);
		   WebElement mouseActions=driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		   Actions action=new Actions(driver);
		   action.moveToElement(mouseActions).perform();
		   action.click().perform();
		   WebElement mouseHover=driver.findElement(By.xpath("//section[.='Mouse Hover']"));
		   action.moveToElement(mouseHover).perform();
		   action.click().perform();
		   Thread.sleep(2000);
		   
		   WebElement image=driver.findElement(By.xpath("//a[.='Image']"));
		   action.moveToElement(image).perform();
		   action.click().perform();
		   Thread.sleep(2000);
		   WebElement img=driver.findElement(By.xpath("//img[@alt='order placed']"));
		   action.moveToElement(img).perform();
		   System.out.println("your order has successfully placed");
	}

}
