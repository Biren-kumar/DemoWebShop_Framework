package pomRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	@FindBy(xpath = "//a[text()='Fiction EX']")
	private WebElement addedProductName;

	@FindBy(xpath = "//input[@name='removefromcart']")
	private List<WebElement> RemoveCheckbox;
	
	@FindBy (xpath = "//input[contains(@class,'update-wishlist-button')]")
	private WebElement UpdateWishlist;
	
	@FindBy (xpath = "//div[contains(text(),'is empty')]")
	private WebElement WishlistIsEmptyText;
	
	public WishlistPage (WebDriver driver){
		PageFactory.initElements( driver , this);
	}

	public WebElement getWishlistIsEmptyText() {
		return WishlistIsEmptyText;
	}

	public WebElement getUpdateWishlist() {
		return UpdateWishlist;
	}

	public WebElement getProductName() {
		return addedProductName;
	}

	public List<WebElement> getRemoveCheckbox() {
		return RemoveCheckbox;
	}
}
