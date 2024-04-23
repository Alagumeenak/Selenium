package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.get("https://demoapps.qspiders.com/");
         driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
         driver.findElement(By.xpath("//section[.='Popups']")).click();
         driver.findElement(By.xpath("//section[.='Hidden division']")).click();
         Thread.sleep(4000);
         driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("file");
         driver.findElement(By.xpath("//label[.='Name']/../..//input")).sendKeys("Nandu");
         driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc123@gmail.com");
         Thread.sleep(4000);
         WebElement product=driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']"));
         Select selectPro=new Select(product);
         selectPro.selectByVisibleText("Laptop");
         Thread.sleep(6000);
         driver.findElement(By.xpath("//textarea[contains(@class,'w-[97%] m-2 h-16 px-4 py-2 border-2 border-stone-600 rounded-md')]")).sendKeys("hi .....@ tata");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         
         
         
         
	}

}
