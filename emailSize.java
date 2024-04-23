package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class emailSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		WebElement emailtf=driver.findElement(By.id("email"));
		int emailHeight=emailtf.getSize().height;
		WebElement emailtfW=driver.findElement(By.name("pass"));
		int emailWidth=emailtfW.getSize().getWidth();
		System.out.println("email text field height is"+emailHeight);
		System.out.println("email text field width is :"+emailWidth);
		driver.quit();
	}

}
