package dropdown;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
      driver.get("https://www.shoppersstack.com");
      driver.findElement(By.id("men")).click();
      driver.findElement(By.xpath("//span[.='Levis Mens Regular Fit Tee']")).click();
      driver.findElement(By.id("compare")).click();
      driver.close();
	}

}
