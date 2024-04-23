package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Reg")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("FirstName")).sendKeys("Roopa");
		Thread.sleep(2000);
		driver.findElement(By.name("LastName")).sendKeys("princess");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("rupikanu@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("poonai");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("poonai");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		
	}

}
