package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExeTest {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.id("hide-textbox")).click();
		 WebElement hiddenTextfield=driver.findElement(By.id("displaye"
		 		+ "d-text"));
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].value='mani 😁 riya';", hiddenTextfield);
		 jse.executeScript("arguments[0].value='Alagumeena'", driver.findElement(By.id("hide-textbox")));
		 driver.findElement(By.id("show-textbox")).click();
	}
}
