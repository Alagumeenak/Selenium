package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
      WebDriver driver=new FirefoxDriver();
      Thread.sleep(2000);
      driver.manage().window().maximize();
      driver.get("https://demoapps.qspiders.com/");
      driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
      Thread.sleep(1000);
      
      
    
      WebElement popinDrop= driver.findElement(By.xpath("//section[@class='poppins text-[15px]']"));
	 Select alertN=new Select(popinDrop);
     alertN.selectByIndex(1);
      driver.switchTo().alert();
	 driver.findElement(By.id("buttonAlert2")).click();
	 driver.switchTo().alert().accept();
	 
     
	}

}
