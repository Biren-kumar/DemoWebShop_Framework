 package testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import pomRepository.BookPage;
import pomRepository.FictionExPage;
import pomRepository.WishlistPage;
@Test(groups = "smoke")
public class WishListTestCase extends BaseTest {
	public void verify_User_is_able_to_add_product_to_Wishlist() {
		hp.getBooksLink().click();
		
		BookPage bp = new BookPage(driver);
		String ExpProduct = bp.getProductName().getText();
		bp.getProductName().click();
		

		FictionExPage fp =new FictionExPage(driver);
		fp.getAddToWishlistButton().click();
		fp.getSuccessMessage().click();
		
		//verification
		Assert.assertEquals(driver.getTitle()," Demo Web Shop. Wishlist");
		Reporter.log("wishlist page is displayed",true);
		
		WishlistPage wl =new WishlistPage(driver);
		String actproduct = wl.getProductName().getText();
		
		//verification
		Assert.assertEquals(ExpProduct, actproduct);
		Reporter.log("test case got passed");
		
		List<WebElement>allremovecheckbox= wl.getRemoveCheckbox();
		for(WebElement checkbox :allremovecheckbox ) {
			checkbox.click();
		}
		wl.getUpdateWishlist().click();
	}
}
