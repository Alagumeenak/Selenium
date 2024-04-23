package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class getTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.get("https://demowebshop.tricentis.com/");
     driver.findElement(By.xpath("//a[text()='Log in']")).click();
     driver.findElement(By.id("Email")).sendKeys("alagumeena1806@gmail.com");
     driver.findElement(By.id("Password")).sendKeys("Password@123");
     driver.findElement(By.xpath("//input[@type='checkbox']")).click();
     driver.findElement(By.className(" login-button")).click();
     driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/jewelry']")).click();
     WebElement sortDropdown = driver.findElement(By.id("products-orderby"));
     Select selectPosition=new Select(sortDropdown);
     selectPosition.selectByVisibleText("Name: A to Z");
	WebElement displayDropdown=driver.findElement(By.id("products-pagesize"));
	Select selectDisplay=new Select(displayDropdown);
	selectDisplay.selectByValue("4");
	WebElement viewDropdown = driver.findElement(By.id("products-viewmode"));
	Select selectViewSelect=new Select(viewDropdown);
	selectViewSelect.selectByIndex(2);
	
	}

}
