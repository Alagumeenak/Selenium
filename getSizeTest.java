package dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	 //   Dimension emaildiemnsion= driver.findElement(By.id("email")).getSize();
	//    System.out.println(emaildiemnsion);
	      
		WebElement emailTextField=driver.findElement(By.id("email"));
		
		WebElement passwordtF=driver.findElement(By.xpath("//input[@id='pass']"));
		
		System.out.println(emailTextField.getRect().getDimension());
		System.out.println(emailTextField.getRect().getPoint());
		System.out.println("Password TF height :"+passwordtF.getRect().getHeight());
		System.out.println("Password TF height"+passwordtF.getRect().getWidth());
		System.out.println("Password TF x point:"+passwordtF.getRect().getX());
		System.out.println("Password TF y point:"+passwordtF.getRect().getY());
		
	}

}
