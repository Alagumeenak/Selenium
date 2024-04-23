package dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTest {

	public WebDriver driver;
	
	@FindBy(id = "FirstName")
	WebElement FirstName;
	@FindBy(id = "LastName")
	WebElement LastName;
	@FindBy(id = "Email")
	WebElement Email;
	@FindBy(id="Password")
	WebElement Password;
	@FindBy(id="ConfirmPassword")
	WebElement Confirm;
	@FindBy(id="register-button")
    WebElement Register;
	public PomTest(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	/*public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstname() {
		return Firstname;
	}
	public WebElement getLastname() {
		return Lastname;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getConfirm() {
		return Confirm;
	}
	public WebElement getRegister() {
		return Register;
	}*/
	public void name(String firstname) {
		FirstName.sendKeys(firstname);
		System.out.println("firstname is entered");
	}
	public void lastname(String lastname) {
		LastName.sendKeys(lastname);
	}
	
}
