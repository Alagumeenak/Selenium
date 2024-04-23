package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    Thread.sleep(2000);
	   WebElement stock= driver.findElement(By.id("box2"));
	    WebElement swed= driver.findElement(By.id("box102"));
	    Actions action=new Actions(driver);
	    action.dragAndDrop(stock, swed).perform();
	    WebElement washing= driver.findElement(By.id("box3"));
	    WebElement USA= driver.findElement(By.id("box103"));
	    action.dragAndDrop(washing,USA).perform();
	    WebElement oslo= driver.findElement(By.id("box1"));
	    WebElement Norway= driver.findElement(By.id("box101"));
	    action.dragAndDrop(oslo, Norway).perform();
	    WebElement Madrid= driver.findElement(By.id("box7"));
	    WebElement Spain= driver.findElement(By.id("box107"));
	    action.dragAndDrop(Madrid, Spain).perform();
	    WebElement Rome = driver.findElement(By.id("box6"));
	    WebElement Italy= driver.findElement(By.id("box106"));
	    action.dragAndDrop(Rome, Italy).perform();
	    WebElement  Seoul= driver.findElement(By.id("box5"));
	    WebElement Korea= driver.findElement(By.id("box105"));
	    action.dragAndDrop(Seoul, Korea).perform();
	    WebElement  Copenhagen= driver.findElement(By.id("box4"));
	    WebElement Denmark= driver.findElement(By.id("box104"));
	    action.dragAndDrop(Copenhagen, Denmark).perform();
	    
	}

}
