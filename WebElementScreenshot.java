package screenshotTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		String time=LocalDateTime.now().toString().replace("-", "_").replace(":", "_");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cricbuzz.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File temp=driver.findElement(By.id("cb-logo-main-menu")).getScreenshotAs(OutputType.FILE);
		
		File permanent=new File("./Screenshots/"+time+".png");
		
		FileHandler.copy(temp, permanent);
		
		driver.quit();
	}
}
