package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        Robot robo=new Robot();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://demoapps.qspiders.com/");
        
        driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("name")).click();
        Thread.sleep(3000);
        robo.keyPress(KeyEvent.VK_CAPS_LOCK);
        robo.keyPress(KeyEvent.VK_A);
      
        robo.keyPress(KeyEvent.VK_L);
       
        robo.keyPress(KeyEvent.VK_A);
        
        robo.keyPress(KeyEvent.VK_G);
      
        robo.keyPress(KeyEvent.VK_U);
       
        robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
        
        
        
	}

}
