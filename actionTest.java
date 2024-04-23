package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionTest {

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
   WebElement icon=driver.findElement(By.xpath("//input[@type='password']"));
   icon.sendKeys("L");
   Thread.sleep(2000);
   WebElement i=driver.findElement(By.xpath("//img[@class='w-5 h-5 mt-5 ml-3 cursor-pointer ']"));
   action.moveToElement(i).click().perform();
   icon.sendKeys("9");
   Thread.sleep(2000);
   WebElement i1=driver.findElement(By.xpath("//img[@class='w-5 h-5 mt-5 ml-3 cursor-pointer ']"));
   action.moveToElement(i1).click().perform();
   icon.sendKeys("@");
   Thread.sleep(2000);
   WebElement i2=driver.findElement(By.xpath("//img[@class='w-5 h-5 mt-5 ml-3 cursor-pointer ']"));
   action.moveToElement(i2).click().perform();
   icon.sendKeys("password");
   Thread.sleep(2000);
   
		   }

}