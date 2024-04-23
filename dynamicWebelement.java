package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dynamicWebelement {
	public static void main(String[] arg) throws InterruptedException {
		// TODO Auto-generated method stub
        // System.setProperty("Webdriver.chrome.exe", "./src/test/resources/Drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demoapps.qspiders.com/ui?scenario=1");
         //driver.findElement(By.className("poppins text-[15px]"));
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//section[text()='Web Table']")).click();
         Thread.sleep(2000);
         Actions action=new Actions(driver);
         
        WebElement dynamo= driver.findElement(By.xpath("//a[.='Dynamic Web Table']"));
        action.moveToElement(dynamo).perform();
        action.click().perform();
        Thread.sleep(2000);
       
         
         WebElement shirt=driver.findElement(By.xpath("//th[.=\"Levi's Shirt\"]/following-sibling::td[@class='px-6 py-4 font-bold text-black']"));
         action.moveToElement(shirt).perform();
         action.click().perform();
         Thread.sleep(2000);
         WebElement samsung=driver.findElement(By.xpath("//th[text()='Samsung Galaxy']/following-sibling::td[@class='px-6 py-4 font-bold text-black']"));
         action.moveToElement(samsung).perform();
         action.click().perform();
         Thread.sleep(2000);
         WebElement iphone=driver.findElement(By.xpath(""));
         action.moveToElement(samsung).perform();
         action.click().perform();
         WebElement envy=driver.findElement(By.xpath(""));
         action.moveToElement(samsung).perform();
         action.click().perform();
         
         driver.quit();

}
}
