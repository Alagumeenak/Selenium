package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class draglistTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		List<WebElement> capital = driver.findElements(By.xpath("//div[@id='dropContent']/div"));
		List<WebElement> countries = driver.findElements(By.xpath("//div[@id='countries']/div"));
		Actions action = new Actions(driver);
		for (int i = 1; i < capital.size(); i+=2) {
			for (int j = 0; j < countries.size(); j++) {
				action.dragAndDrop(capital.get(i),countries.get(j)).perform();
				Thread.sleep(2000);
				System.out.println(capital.get(i).getCssValue("background-color"));
				if (capital.get(i).getCssValue("background-color").equals("rgb(0, 255, 0)")) {
					Thread.sleep(5000);
					break;
				}
			}
		}
		driver.quit();
	}

}
