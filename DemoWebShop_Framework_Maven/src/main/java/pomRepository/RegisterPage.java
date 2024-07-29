package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterLink;
	
	@FindBy(xpath = "//input[@value='M']")
	private WebElement MaleRadioButton;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement FirstnameTextfield;
	
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement LastNameTextfield;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement EmailTextfield;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement PasswordTextField;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement ConfirmPasswordTextField;
	
	@FindBy(xpath = "//input[@id='register-button']")
	private WebElement RegisterButton;
	
	@FindBy(xpath = "//li[text()='The specified email already exists']")
	private WebElement WarningMsg;
	
	@FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
	private WebElement SuccessMsg;
	
	

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getWarningMsg() {
		return WarningMsg;
	}

	public WebElement getSuccessMsg() {
		return SuccessMsg;
	}

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getMaleRadioButton() {
		return MaleRadioButton;
	}

	public WebElement getFirstnameTextfield() {
		return FirstnameTextfield;
	}

	public WebElement getLastNameTextfield() {
		return LastNameTextfield;
	}

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
}
