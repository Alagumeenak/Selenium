package dropdown;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebExplicitwaitTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("alagumeena.smiley@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Likesbabies@18");
		driver.findElement(By.xpath("//span[.='Login']")).click();
      //   Thread.sleep(10000);
		 driver.findElement(By.linkText("Men")).click();
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	//	wait.until(ExpectedConditions.visibilityOf(men));
		
		driver.findElement(By.xpath("//span[.='Men Regular Fit Solid Cut Away Coll...']")).click();
		driver.findElement(By.id("compare")).click();
		

		
		
	}

}
