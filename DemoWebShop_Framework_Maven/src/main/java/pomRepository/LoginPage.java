package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id ="Email")
private WebElement emailTextField;

@FindBy(css ="input[id='Password']")
private WebElement passwordTextField;

@FindBy(xpath ="//input[@value='Log in']")
private WebElement LoginButton;

@FindBy(xpath ="//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
private WebElement WarningPopup;

public WebElement getWarningPopup() {
	return WarningPopup;
}

public void setWarningPopup(WebElement warningPopup) {
	WarningPopup = warningPopup;
}

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getEmailTextField() {
	return emailTextField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getLoginButton() {
	return LoginButton;
}
}