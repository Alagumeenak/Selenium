package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionRatingsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
				   
				   WebElement ratings=driver.findElement(By.xpath("//a[text()='Ratings']"));
				   action.moveToElement(ratings).click().perform();
				   Thread.sleep(2000);
				   WebElement i2=driver.findElement(By.xpath("//div[@class='flex justify-center pt-2']"));
				   action.moveToElement(i2).click().perform();
				   Thread.sleep(2000);
				   WebElement star=driver.findElement(By.xpath("//input[@value='4']"));
				   action.moveToElement(star).click().perform();
				   

	}

}
