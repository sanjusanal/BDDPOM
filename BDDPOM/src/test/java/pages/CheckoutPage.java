package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	@FindBy(id="first-name")
	WebElement firstName;
	@FindBy(id="last-name")
	WebElement lastName;
	@FindBy(id="postal-code")
	WebElement postCode;
	@FindBy(id="continue")
	WebElement cnt;
	@FindBy(id="finish")
	WebElement finish;
	@FindBy(xpath ="//h2[contains(text(),'Thank you for your order!')]")
	WebElement Msg;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void information(String strfirst, String strLast, String code) {
		firstName.sendKeys(strfirst);
		lastName.sendKeys(strLast);
		postCode.sendKeys(code);
		cnt.click();
		finish.click();
	}
	public boolean isOrderSuccess() {
		return Msg.isDisplayed();
	}

}
