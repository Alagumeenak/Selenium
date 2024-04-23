package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions action=new Actions(driver);
     	//action.scrollByAmount(100,0).perform();
		Thread.sleep(2000);
	    WebElement downloadLink= driver.findElement(By.xpath("//div[text()='Best of Electronics']"));
	    action.scrollToElement(downloadLink).perform();
		
	}

}
