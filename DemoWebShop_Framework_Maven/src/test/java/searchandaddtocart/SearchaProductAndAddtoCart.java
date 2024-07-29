package searchandaddtocart;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchaProductAndAddtoCart extends genericlibrary.BaseTest {
	@Test
	public void addtocart() {
		hp.getSearchTextField().click();
		hp.getSearchTextField().sendKeys("blue jeans");
		hp.getSearchButton().click();
		//verification
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Search");
		Reporter.log("searched product displayed");
		pomRepository.SearchPage sp = new pomRepository.SearchPage(driver);
		String ExpProductname = sp.getProductname().getText();
		sp.getAddtoCartbutton().click();
		hp.getShoppingCartLink().click();
		
		//verification
				Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
				Reporter.log("Cart page Displayed");
		pomRepository.AddtoCartPage ap= new pomRepository.AddtoCartPage(driver);
		String Actproductname = ap.getAddedProduct().getText();
		
		//verification
		Assert.assertEquals(ExpProductname, Actproductname);
		Reporter.log("product added to cart");
		
		
	//	ap.getProductcounttextfield().click();
	//	ap.getProductcounttextfield().sendKeys("4");
		
		
		
		List<WebElement>allremovecheckbox=ap.getAllremoveCheckbox();

		for (WebElement checkbox: allremovecheckbox) {
			checkbox.click();
		}
		ap.getUpdatecartbutton().click();
		
		
	}
}
