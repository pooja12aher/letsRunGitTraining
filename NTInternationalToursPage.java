package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NTInternationalToursPage {
	WebDriver driver;

	@FindBy(xpath = "//a[normalize-space()='Paris']")
	public WebElement paris;
	
	@FindBy(xpath = "//p[contains(text(),'Paris is the capital and most populous city of Fra')]")
	public WebElement texttoverify;
	
	

	public NTInternationalToursPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void selectCountryparis() {
		paris.click();
	}

	public String getTextOfParis()
	{
		String text=texttoverify.getText();
		
		return text;
	}
}
