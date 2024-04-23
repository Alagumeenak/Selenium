package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionMouseTabTest {
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
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
	   WebElement tabMouse=driver.findElement(By.xpath("//a[.='Tab']"));
	   action.moveToElement(tabMouse).perform();
	   action.click().perform();
	   Thread.sleep(2000);
	   
	   WebElement womenMouse=driver.findElement(By.xpath("//li[@class='Women p-4 relative']"));
	   action.moveToElement(womenMouse).perform();
	   action.click().perform();
	   Thread.sleep(2000);
	   WebElement womenEthnic=driver.findElement(By.className("Women_1"));
	   action.moveToElement(womenEthnic).perform();
	   action.click().perform();
	   Thread.sleep(2000);
	   WebElement womenSarees=driver.findElement(By.xpath("//span[text()='Women Sarees']"));
	   action.moveToElement(womenSarees).perform();
	   action.click().perform();
	   Thread.sleep(2000);
	   WebElement womenDiscount=driver.findElement(By.xpath("//section[@class='Women_List_2']//li[text()='70% or more']"));
	   action.moveToElement(womenDiscount).perform();
	   action.click().perform();
	   Thread.sleep(3000);
	   
}
}
