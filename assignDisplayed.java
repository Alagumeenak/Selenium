package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver= new FirefoxDriver();
   driver.manage().window().maximize();
   driver.get("https://demowebshop.tricentis.com/");
   Thread.sleep(2000);
   
   boolean isDesktopDisplayed=driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/desktops']")).isDisplayed();
	
		System.out.println("Is desktops link displayed true"+isDesktopDisplayed);
		
		if(isDesktopDisplayed==true) {
			
			System.out.println("Test case pass");
	}
	else
	{
		System.out.println("Test case fail");
	}
		
		driver.quit();
	}
}
