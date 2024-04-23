package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dummy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
	    Thread.sleep(3000);
	   String txt = driver.findElement(By.className("bg-gradient-to-r")).getText();
	   Thread.sleep(2000);
	   System.out.println(txt);

	}

}
