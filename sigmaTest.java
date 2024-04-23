package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sigmaTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testsigma.com/");
		Thread.sleep(8000);
	    driver.switchTo().frame("fc_widget");
	    Thread.sleep(3000);
	    driver.findElement(By.id("chat-icon")).click();
		
	}

}
