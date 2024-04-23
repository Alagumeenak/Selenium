package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleActionTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	      Robot robo=new Robot();
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.get("https://google.com/");
	      Thread.sleep(2000);
	      
	      robo.keyPress(KeyEvent.VK_A);
	        robo.keyRelease(KeyEvent.VK_A);
	        robo.keyPress(KeyEvent.VK_L);
	        robo.keyRelease(KeyEvent.VK_L);
	        robo.keyPress(KeyEvent.VK_A);
	        robo.keyRelease(KeyEvent.VK_A);
	        robo.keyPress(KeyEvent.VK_G);
	        robo.keyRelease(KeyEvent.VK_G);
	        robo.keyPress(KeyEvent.VK_U);
	        robo.keyRelease(KeyEvent.VK_U);
	        
	}

}
