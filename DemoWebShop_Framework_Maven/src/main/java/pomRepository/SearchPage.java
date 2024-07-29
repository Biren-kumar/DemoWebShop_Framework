package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	@FindBy(xpath = "//div[@class='details']//a[text()='Blue Jeans']")
	private WebElement productname;

	@FindBy(xpath = "//input[contains(@class,'add-to-cart-button')]")
	private WebElement AddtoCartbutton;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getAddtoCartbutton() {
		return AddtoCartbutton;
	}
}
