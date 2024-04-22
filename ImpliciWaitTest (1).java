package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciWaitTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui");
		
		//Click on Frames
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		//Click on Iframes
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		//Click on Nested with Multiple iframes link
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		
		driver.switchTo().frame(0);
		
		//Get the text of email
		String email=driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
	
		//Get the password
		String password=driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
	
		//Get the confirm password
		String confirmPassword=driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
	
		//Switch to Login page
		driver.switchTo().frame(0);
		
		//To switch to Email text field
		driver.switchTo().frame(0);
		//Enter email
		driver.findElement(By.id("email")).sendKeys(email);
		//Switch toParent frame
		driver.switchTo().parentFrame();
		
		//Switch to password text field
		driver.switchTo().frame(1);
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys(password);
		//Switch to Parent frame
		driver.switchTo().parentFrame();
		
		//Switch to Confirm password text field
		driver.switchTo().frame(2);
		
		//Enter confirm password
		driver.findElement(By.id("confirm")).sendKeys(confirmPassword);
		//Switch to Parent frame
		driver.switchTo().parentFrame();
		
		//Switch to Submit
		driver.switchTo().frame(3);
		
		//Click on submit button
		driver.findElement(By.id("submitButton")).click();
	
	}
}
