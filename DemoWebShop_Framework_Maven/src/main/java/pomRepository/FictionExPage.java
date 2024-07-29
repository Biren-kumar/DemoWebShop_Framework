package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionExPage {
@FindBy (xpath = "//div/*[contains(text(),'Fiction EX')]")	
private WebElement ProductName;
	
@FindBy (xpath = "//input[contains(@id,'add-to-wishlist-button')]")
private WebElement AddToWishlistButton;

@FindBy(xpath = "//a[text()='wishlist']")
private WebElement SuccessMessage;



public FictionExPage (WebDriver driver){
	PageFactory.initElements( driver , this);
}

public WebElement getProductName() {
	return ProductName;
}

public WebElement getAddToWishlistButton() {
	return AddToWishlistButton;
}
public WebElement getSuccessMessage() {
	return SuccessMessage;
}

}
