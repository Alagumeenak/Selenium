package popUP;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindowPopUpTest {

	public static void main(String[] args) throws InterruptedException {
//		Launch browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Navigate to URL
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);
		
		Actions action=new Actions(driver);
		
		//Mouse hover on MEN link
		action.moveToElement(driver.findElement(By.id("men"))).perform();
		Thread.sleep(3000);
		
		//Click on SHIRTS
		driver.findElement(By.linkText("SHIRTS")).click();
		Thread.sleep(3000);
		
		//Move cursor onto Men shirt
		action.moveToElement(driver.findElement(By.linkText("Men Shirt"))).perform();
		Thread.sleep(1000);
		//Click on Product
		driver.findElement(By.cssSelector("[alt='Men Regular Fit Solid Cut Away Collar Casual Shirt']")).click();
		Thread.sleep(3000);
		//Click on Compare button
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
		
		//Get the address of current window
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent window address: "+parentWindow);
		
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Total number of windows: "+allWindows.size());
		for (String window : allWindows) {
			driver.switchTo().window(window);
			String url=driver.getCurrentUrl();
			if(url.contains("flipkart")) {
				break;
			}
		}
		//Maximize flipkart
		driver.manage().window().maximize();
		
		//Click on Mobile link
		driver.findElement(By.xpath("//span//span[.='Mobiles']")).click();
	
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.id("women")).click();
	}
}
