package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseKeyboardActionTEst {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	        Robot robo=new Robot();
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.get("https://demowebshop.tricentis.com/");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.partialLinkText("Register")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("FirstName")).sendKeys("Papa");
	        Thread.sleep(1000);
	        robo.keyPress(KeyEvent.VK_CONTROL);
	        robo.keyPress(KeyEvent.VK_A);
	        robo.keyRelease(KeyEvent.VK_A);
	        robo.keyPress(KeyEvent.VK_C);

	        robo.keyRelease(KeyEvent.VK_C);
	        
	        robo.keyRelease(KeyEvent.VK_CONTROL);
	       
	       
	        robo.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(1000);
	        robo.keyPress(KeyEvent.VK_CONTROL);
	        robo.keyPress(KeyEvent.VK_V);
	        robo.keyRelease(KeyEvent.VK_TAB);
	        robo.keyRelease(KeyEvent.VK_CONTROL);
	        robo.keyRelease(KeyEvent.VK_V);
	        
	        
            
	}

}
