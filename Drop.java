package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.get("https://demoapps.qspiders.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//section[.='Dropdown']")).click();
        Thread.sleep(1000);
        WebElement phonenoDrop= driver.findElement(By.id("select1"));
        Select selectphone=new Select(phonenoDrop);
        System.out.println("Is city drop down is multiple select?:"+selectphone);
        selectphone.selectByVisibleText("+44");
        Thread.sleep(200);

        WebElement genderDrop= driver.findElement(By.id("select2"));
        Select selectgender=new Select(genderDrop);
        System.out.println("Is city drop down is multiple select?:"+selectgender);
        selectgender.selectByVisibleText("Female");
        Thread.sleep(200);
        WebElement countryDropdown= driver.findElement(By.id("select3"));
        Select selectCountry=new Select(countryDropdown);
        System.out.println("Is country dropdown is multiple select?:"+selectCountry);
        Thread.sleep(1000);
        selectCountry.selectByIndex(7);
        Thread.sleep(1000);
        
        WebElement stateDropdown=driver.findElement(By.id("select5"));
        Select selectState=new Select(stateDropdown);
     
        System.out.println("Is state dropdown is multiple select?:"+selectState);
        selectState.selectByValue("Tamil Nadu");
        Thread.sleep(1000);
        
        WebElement cityDropdown=driver.findElement(By.xpath("//option[.='Select City']/.."));
        Select selectCity=new Select(cityDropdown);
       
        System.out.println("Is city drop down is multiple select?:"+selectCity);
        selectCity.selectByVisibleText("Ariyalur");
        Thread.sleep(1000);
        
        WebElement qtyDrop=driver.findElement(By.id("select7"));
        Select selectQty=new Select(qtyDrop);
        System.out.println("Is city drop down is multiple select?:"+ selectQty);
        selectQty.selectByIndex(4);
        Thread.sleep(1000);
        
        driver.findElement(By.id("continuebtn")).click();
        Thread.sleep(100);
        
        driver.quit();
	}

}
