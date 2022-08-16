package pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NTHomePage2 {
	WebDriver driver;
	NTMyAccount account;

	@FindBy(name="username")
	public WebElement userName;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(xpath = "//form[@name='loginform']/button")
	public WebElement submitButton;
	
	@FindBy(xpath = "//button[@class='w3-button']")
	public WebElement tours;
	
	@FindBy(xpath ="//a[normalize-space()='International Tour']")
	public WebElement internationaltours;
	

	
	

	
	public NTHomePage2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		System.out.println("I am updating file");
	}

	public NTMyAccount login(String user, String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);
		submitButton.click();
		return new NTMyAccount(driver);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void tearDown() {
		driver.quit();
	}
public void alertaccept() {
	Alert ac = driver.switchTo().alert();
	ac.accept();
}

public NTInternationalToursPage internationaltoursselect()//Create constructor for international calss
{
	tours.click();
	internationaltours.click();
	
	return new NTInternationalToursPage(driver);
}
}
