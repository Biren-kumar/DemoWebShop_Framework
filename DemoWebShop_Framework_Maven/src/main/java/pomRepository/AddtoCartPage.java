package pomRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
	@FindBy(xpath = "//input[@name='removefromcart']")
	private List<WebElement> AllremoveCheckbox;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updatecartbutton;
	
	@FindBy(xpath = "//td//a[@href='/blue-jeans']")
	private WebElement addedProduct;
	
	@FindBy(xpath = "//td//span[@class='product-unit-price']")
	private WebElement productpriceText;
	
	@FindBy(xpath = "//td//input[@class='qty-input valid']")
	private WebElement productcounttextfield;
	
	@FindBy(xpath = "//td//span[@class='product-subtotal']")
	private WebElement totalpricetext;

	public AddtoCartPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public List<WebElement> getAllremoveCheckbox() {
		return AllremoveCheckbox;
	}
	public WebElement getUpdatecartbutton() {
		return updatecartbutton;
	}
	public WebElement getAddedProduct() {
		return addedProduct;
	}

	public WebElement getProductpriceText() {
		return productpriceText;
	}

	public WebElement getProductcounttextfield() {
		return productcounttextfield;
	}

	public WebElement getTotalpricetext() {
		return totalpricetext;
	}
}