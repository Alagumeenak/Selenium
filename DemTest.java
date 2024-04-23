package dropdown;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemTest {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("vairavannamalai18@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Password@123");
    driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
    
  /*  driver.findElement(By.partialLinkText("Digital download")).click();
    driver.findElement(By.xpath("//span[.='Wishlist']")).click();
    driver.findElement(By.xpath("//td[@class='add-to-cart']")).click();
    driver.findElement(By.name("addtocartbutton")).click();
    */
    driver.findElement(By.partialLinkText("Jewelry")).click();
    
    WebElement product= driver.findElement(By.id("products-orderby"));
    Select selectProductDrop=new Select(product);
    System.out.println("select product is multiple"+selectProductDrop);
    selectProductDrop.selectByIndex(4);
    
    WebElement pages= driver.findElement(By.id("products-pagesize"));
    Select selectPageSize=new Select(pages);
    System.out.println("select product is multiple"+selectPageSize);
    selectPageSize.selectByVisibleText("8");
    
    
    WebElement grid= driver.findElement(By.id("products-viewmode"));
    Select viewMode=new Select(grid);
    System.out.println("select product is multiple"+viewMode);
    viewMode.selectByVisibleText("Grid");
    
    driver.findElement(By.linkText("Black & White Diamond Heart")).click();
    driver.findElement(By.id("addtocart_14_EnteredQuantity")).sendKeys("1");
   
    driver.findElement(By.id("add-to-cart-button-14")).click();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@class='content']"))));
  // WebElement msg= driver.findElement(By.xpath("//p[@class='content']"));
  // System.out.println("yes message has been displayed"+msg.isDisplayed());
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
  
    // Remove cart Method
   /* driver.findElement(By.className("remove-from-cart")).click();
    driver.findElement(By.name("updatecart")).click();
    WebElement empty =driver.findElement(By.xpath(" //div[@class=\"order-summary-content\"]"));
    System.out.println("Yes displayed"+empty.isDisplayed());
    
    
    driver.findElement(By.partialLinkText("Digital download")).click();  
   
    */
   
    //WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
   // wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("Jewelry"))));
  //   
  /*  WebElement product1= driver.findElement(By.id("products-orderby"));
    Select selectProductDrop1=new Select(product1);
    System.out.println("select product is multiple"+selectProductDrop1);
    selectProductDrop1.selectByIndex(4);
    
    WebElement pages1= driver.findElement(By.id("products-pagesize"));
    Select selectPage=new Select(pages);
    System.out.println("select product is multiple"+selectPage);
    selectPage.selectByVisibleText("8");
    
    
    WebElement grid1= driver.findElement(By.id("products-viewmode"));
    Select viewMode1=new Select(grid1);
    System.out.println("select product is multiple"+viewMode1);
    viewMode1.selectByVisibleText("Grid");
    
    driver.findElement(By.linkText("3rd Album")).click();
    driver.findElement(By.id("addtocart_14_EnteredQuantity")).sendKeys("1");
   
    driver.findElement(By.id("add-to-cart-button-53")).click();
    */
    
    
    WebElement countryCode=driver.findElement(By.id("CountryId"));
    Select selectCountry= new Select(countryCode);
    selectCountry.selectByVisibleText("India");
    driver.findElement(By.id("ZipPostalCode")).sendKeys("600053");   
    driver.findElement(By.id("termsofservice")).click();
    driver.findElement(By.id("checkout")).click();
    
    driver.findElement(By.xpath("//div[@id='billing-buttons-container']//input[@class='button-1 new-address-next-step-button']")).click();
    driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input[@class='button-1 new-address-next-step-button']")).click();
    
    driver.findElement(By.id("shippingoption_2")).click();
    driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")).click();
    
    driver.findElement(By.id("paymentmethod_2")).click();
    driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
   
    WebElement card=driver.findElement(By.id("CreditCardType"));
    Select selectCard=new Select(card);
    selectCard.selectByValue("MasterCard");
    driver.findElement(By.id("CardholderName")).sendKeys("Alagumeenak");
    driver.findElement(By.id("CardNumber")).sendKeys("5555 5555 5555 4444");
   
    
    WebElement mon= driver.findElement(By.id("ExpireMonth"));
    Select selectMon=new Select(mon);
    selectMon.selectByVisibleText("09");
    
    WebElement year= driver.findElement(By.id("ExpireYear"));
    Select selectyear=new Select(year);
    selectyear.selectByVisibleText("2027");
    
    driver.findElement(By.id("CardCode")).sendKeys("8009");
    driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
    driver.findElement(By.className("//input[@class='button-1 confirm-order-next-step-button']")).click();
  
 
}
}