package dropdown;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildwindowTest {
	public static void main(String[] args) {
		
	 WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://demoapps.qspiders.com/");
     driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
     driver.findElement(By.xpath("//section[.='Popups']")).click();
     driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
     driver.findElement(By.linkText("Multiple Windows")).click();
   
    driver.findElement(By.id("browserButton3")).click();
    String parentwindow= driver.getWindowHandle();
    Set<String>   childwindow=driver.getWindowHandles();
    for (String window : childwindow) {
    driver.switchTo().window(window);
	if(driver.getCurrentUrl().contains("Signup")) {
		break;
	}
		
	}
	}
}
