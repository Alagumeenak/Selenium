package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class submitBilling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		Thread.sleep(2000);
       WebElement emailTextfield= driver.findElement(By.id("email"));
       emailTextfield.clear();
       emailTextfield.sendKeys("abc@gmail.com");
       
       WebElement passwordTextfield= driver.findElement(By.id("password"));
       passwordTextfield.clear();
       passwordTextfield.sendKeys("Password@123");
       Thread.sleep(2000);
        driver.findElement(By.xpath("//form")).submit();
//        driver.quit();
      
	}

}
