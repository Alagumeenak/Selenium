package dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  driver.get("https://demoapps.qspiders.com/");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//section[.='Web Elements']")).click();
		   Thread.sleep(20000);
		   driver.findElement(By.xpath("//section[.='Popups']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("buttonAlert2")).click();
		   Thread.sleep(2000);
	
		   Alert alert=driver.switchTo().alert();
		   alert.accept();
		   String expectedmsg="Alert Button Clicked";
		  String msg= driver.findElement(By.xpath("//p[.='Alert Button Clicked']")).getText();
		  if(msg.equals(expectedmsg))
		  {
			  System.out.println("Testcase pass");
		  }
		  else
		  {
			System.out.println("Testcase fail");	 
		  }
		
		
	}

}
