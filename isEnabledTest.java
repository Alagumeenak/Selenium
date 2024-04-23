package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isEnabledTest {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stud
		Runtime.getRuntime().exec("Notepad");
	    Thread.sleep(2000);
	    Robot robo=new Robot();
	    robo.keyPress(KeyEvent.VK_1);
	    robo.keyPress(KeyEvent.VK_SHIFT);
	    robo.keyPress(KeyEvent.VK_2);
	    robo.keyPress(KeyEvent.VK_9);
	    robo.keyPress(KeyEvent.VK_RIGHT);
	    robo.keyPress(KeyEvent.VK_K);
	    robo.keyPress(KeyEvent.VK_DOWN);
	    robo.keyPress(KeyEvent.VK_M);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_ALT);
		robo.keyPress(KeyEvent.VK_F4);
		robo.keyRelease(KeyEvent.VK_ALT);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyPress(KeyEvent.VK_U);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyPress(KeyEvent.VK_Y);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	

	}

}
