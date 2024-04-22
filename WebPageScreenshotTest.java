package screenshotTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshotTest {

	public static void main(String[] args) throws IOException {
		
		String time=LocalDateTime.now().toString().replace("-", "_").replace(":", "_");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 1: Covert WebDriver reference into takesScreenshot type
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//Step 2: Get the screenshot in the File format and store in Temporary file
		File temp=ts.getScreenshotAs(OutputType.FILE);
	
		//Step 3: Create a Permanent file 
		File permanent=new File("./Screenshots/"+time+".png");
	
		//Step 4: Copy the screenshot from Temporary file to permanent file
		FileHandler.copy(temp, permanent);
		
		driver.quit();
	}
}
