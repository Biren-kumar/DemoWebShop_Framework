package pomRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPage {
@FindBy(xpath = "//input[contains(@class,'add-to-cart-button')]")
private List<WebElement>  AllAddToCartButton;

public DigitalDownloadsPage (WebDriver driver){
	PageFactory.initElements( driver , this);
}

public List<WebElement> getAllAddToCartButton() {
	return AllAddToCartButton;
}
}
