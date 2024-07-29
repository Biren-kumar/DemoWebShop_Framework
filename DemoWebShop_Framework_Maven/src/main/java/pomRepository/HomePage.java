package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath = "//a[text()='Register']")
private WebElement RegisterLink;

@FindBy(xpath = "//a[text()='Log in']")
private WebElement LoginLink;

@FindBy(xpath = "//span[text()='Shopping cart']")
private WebElement ShoppingCartLink;

@FindBy(xpath = "//span[text()='Wishlist']")
private WebElement WishlistLink;

@FindBy(xpath = "//input[@id='small-searchterms']")
private WebElement SearchTextField;

@FindBy(xpath = "//input[@type='submit']")
private WebElement SearchButton;

@FindBy(xpath = "(//div[@class='header-menu']//a[contains(text(),'Books')])[1]")
private WebElement BooksLink;

@FindBy(xpath = "(//div[@class='header-menu']//a[contains(text(),'Computers')])[1]")
private WebElement ComputersLink;

@FindBy(xpath = "(//div[@class='header-menu']//a[contains(text(),'Apparel')])[1]")
private WebElement ShoesLink;

@FindBy(xpath = "(//div[@class='header-menu']//a[contains(text(),'Digital')])[1]")
private WebElement DigitalDownloadsLink;

@FindBy(xpath = "(//div[@class='header-menu']//a[contains(text(),'Jewelry')])[1]")
private WebElement JewelryLink;

@FindBy(xpath = "(//div[@class='header-menu']//a[contains(text(),'Gift')])[1]")
private WebElement GiftCardsLink;

@FindBy(xpath = "(//div[@class='header-menu']//a[contains(text(),'Electronics')])[1]")
private WebElement ElectronicsLink;

@FindBy(xpath = "//a[text()='Log out']")
private WebElement LogoutLink;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getRegisterLink() {
	return RegisterLink;
}

public WebElement getLoginLink() {
	return LoginLink;
}

public WebElement getShoppingCartLink() {
	return ShoppingCartLink;
}

public WebElement getWishlistLink() {
	return WishlistLink;
}

public WebElement getSearchTextField() {
	return SearchTextField;
}

public WebElement getSearchButton() {
	return SearchButton;
}

public WebElement getBooksLink() {
	return BooksLink;
}

public WebElement getComputersLink() {
	return ComputersLink;
}

public WebElement getShoesLink() {
	return ShoesLink;
}

public WebElement getDigitalDownloadsLink() {
	return DigitalDownloadsLink;
}

public WebElement getJewelryLink() {
	return JewelryLink;
}

public WebElement getGiftCardsLink() {
	return GiftCardsLink;
}

public WebElement getElectronicsLink() {
	return ElectronicsLink;
}

public WebElement getLogoutLink() {
	return LogoutLink;
}

}
