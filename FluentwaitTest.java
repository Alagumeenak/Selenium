package dropdown;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentwaitTest {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofSeconds(10));
	wait.pollingEvery(Duration.ofMillis(250));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	
	driver.quit();
	
	
}
}
