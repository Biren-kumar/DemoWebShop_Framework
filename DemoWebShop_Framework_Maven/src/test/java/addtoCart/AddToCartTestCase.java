package addtoCart;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericlibrary.Listinerimplimentation.class)
public class AddToCartTestCase extends genericlibrary.BaseTest {
	@Test(groups = "smoke")
	public void addToCart() throws InterruptedException {
		hp.getDigitalDownloadsLink().click();
		//verification
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Digital downloads");
		Reporter.log("DD page Displayed");
		
		pomRepository.DigitalDownloadsPage dd =new pomRepository.DigitalDownloadsPage(driver);
		List<WebElement>alladdtocart=dd.getAllAddToCartButton();

		int Expsize= alladdtocart.size();

		for(WebElement addtocart : alladdtocart) {
			addtocart.click();
			Thread.sleep(2000);

		}
		hp.getShoppingCartLink().click();

		//verification
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
		Reporter.log("Cart page Displayed");
		
		
		pomRepository.AddtoCartPage ac=new pomRepository.AddtoCartPage(driver);
		List<WebElement>allremovecheckbox=ac.getAllremoveCheckbox();
	int	Actsize= allremovecheckbox.size();
	
//verification
	Assert.assertEquals(Actsize, Expsize);
	Reporter.log("Test Case got passed");
	
	for (WebElement checkbox: allremovecheckbox) {
		checkbox.click();
	}
	ac.getUpdatecartbutton().click();
	}
}
