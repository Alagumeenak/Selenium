package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new FirefoxDriver();
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("happy");
            
            Thread.sleep(2000);
          
            List<WebElement> allSuggesstions=driver.findElements(By.xpath("//div[@role='presentation']//b/.."));
           
            System.out.println("total number of suggesstions:"+allSuggesstions.size());
            
            for (WebElement suggesstion : allSuggesstions) {
				System.out.println(suggesstion.getText());
			}
            
            driver.quit();
	}

}
